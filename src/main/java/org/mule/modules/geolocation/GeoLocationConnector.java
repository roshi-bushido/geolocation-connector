package org.mule.modules.geolocation;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.modules.geolocation.config.ConnectorConfig;

@Connector(name="geo-location", friendlyName="GeoLocation", minMuleVersion = "3.7")
public class GeoLocationConnector {

    @Config
    ConnectorConfig config;

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}