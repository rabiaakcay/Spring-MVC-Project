package com.id3academy.springmvcproject.service;

import com.id3academy.springmvcproject.config.ProductsServiceConfig;
import com.id3academy.springmvcproject.model.Products;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.net.ssl.SSLContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Objects;

@Service
@AllArgsConstructor
@Slf4j
public class ProductsService {
    private final RestTemplate restTemplate;

    @Autowired
    private ProductsServiceConfig productsServiceConfig;

        public byte[] getProductsFromUrl() {
        ResponseEntity<byte[]> response = null;
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();

            TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;
            SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom()
                    .loadTrustMaterial(null, acceptingTrustStrategy)
                    .build();
            SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);
            CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
            HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
            requestFactory.setHttpClient(httpClient);
            RestTemplate restTemplate = new RestTemplate(requestFactory);
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<>(headers);
            response = restTemplate.exchange(productsServiceConfig.getUrl(), HttpMethod.GET, entity, byte[].class);
            InputStream inputStream = new ByteArrayInputStream(Objects.requireNonNull(response.getBody()));
//            document = builder.parse(inputStream);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
        return response.getBody();
    }

//    public Products parseProducts() throws ParserConfigurationException, NoSuchAlgorithmException, KeyManagementException, KeyStoreException, SAXException, IOException e) {
//        {
//            String urlString = "http://a.cdn.searchspring.net/help/feeds/searchspring.xml";
//            URL url = new URL(urlString);
//            URLConnection conn = url.openConnection();
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document doc = builder.parse(conn.getInputStream());
//            TransformerFactory transformerFactory = TransformerFactory.newInstance();
//            Transformer xform = transformerFactory.newTransformer();
//            xform.transform(new DOMSource(doc).new StreamResult(System.out));
//
//        }
//}



//    public List<Products> execute(){
//        log.info("Get products from server");
//
//    }

    }

