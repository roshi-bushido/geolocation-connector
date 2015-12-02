package org.mule.modules.geolocation.config;

import java.util.ArrayList;
import java.util.List;

import org.mule.api.annotations.components.WsdlProvider;
import org.mule.api.annotations.ws.WsdlServiceEndpoint;
import org.mule.api.annotations.ws.WsdlServiceRetriever;
import org.mule.devkit.api.ws.definition.DefaultServiceDefinition;
import org.mule.devkit.api.ws.definition.ServiceDefinition;

@WsdlProvider(friendlyName = "Configuration")
public class ConnectorConfig {

    @WsdlServiceRetriever
    public List<ServiceDefinition> getServiceDefinitions() {

        final List<ServiceDefinition> serviceDefinitions = new ArrayList<ServiceDefinition>();

        serviceDefinitions.add(new DefaultServiceDefinition(
                "IP2Geo_IP2GeoHttpPost",
                "ip2geo.asmx (IP2GeoHttpPost)",
                "http://ws.cdyne.com/ip2geo/ip2geo.asmx?wsdl",
                "IP2Geo",
                "IP2GeoHttpPost"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "IP2Geo_IP2GeoHttpGet",
                "ip2geo.asmx (IP2GeoHttpGet)",
                "http://ws.cdyne.com/ip2geo/ip2geo.asmx?wsdl",
                "IP2Geo",
                "IP2GeoHttpGet"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "IP2Geo_IP2GeoSoap",
                "ip2geo.asmx (IP2GeoSoap)",
                "http://ws.cdyne.com/ip2geo/ip2geo.asmx?wsdl",
                "IP2Geo",
                "IP2GeoSoap"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "IP2Geo_IP2GeoSoap12",
                "ip2geo.asmx (IP2GeoSoap12)",
                "http://ws.cdyne.com/ip2geo/ip2geo.asmx?wsdl",
                "IP2Geo",
                "IP2GeoSoap12"));
        return serviceDefinitions;
    }

    @WsdlServiceEndpoint
    public String getServiceEndpoint(ServiceDefinition definition) {
        String result;
        final String id = definition.getId();
        switch(id){
                case "IP2Geo_IP2GeoHttpPost": {
                result = "http://ws.cdyne.com/ip2geo/ip2geo.asmx";
                break;
            }
                case "IP2Geo_IP2GeoHttpGet": {
                result = "http://ws.cdyne.com/ip2geo/ip2geo.asmx";
                break;
            }
                case "IP2Geo_IP2GeoSoap": {
                result = "http://ws.cdyne.com/ip2geo/ip2geo.asmx";
                break;
            }
                case "IP2Geo_IP2GeoSoap12": {
                result = "http://ws.cdyne.com/ip2geo/ip2geo.asmx";
                break;
            }
                default: {
                throw new IllegalArgumentException(id + " endpoint could not be resolved.");
            }
        }
        return result;
    }


}