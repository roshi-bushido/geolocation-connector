
package org.mule.modules.geolocation.adapters;

import com.google.common.base.Optional;
import java.util.Collections;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.lifecycle.Disposable;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.devkit.api.ws.authentication.WsdlSecurityStrategy;
import org.mule.devkit.api.ws.definition.ServiceDefinition;
import org.mule.devkit.api.ws.transport.WsdlTransport;
import org.mule.devkit.internal.ws.common.WSResolver;
import org.mule.devkit.internal.ws.common.WsdlAdapter;
import org.mule.devkit.internal.ws.metadata.WsdlMetaDataDescriptor;
import org.mule.devkit.internal.ws.model.DefaultWSResolver;
import org.mule.modules.geolocation.GeoLocationConnector;
import org.mule.modules.geolocation.config.ConnectorConfig;
import org.w3c.dom.Document;


/**
 * A <code>GeoLocationConnectorConnectorConfigWsdlProviderAdapter</code> is a wrapper around {@link GeoLocationConnector } that represents the WSDL generic connector {@link ConnectorConfig }
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.1", date = "2015-12-02T07:42:56-03:00", comments = "Build UNNAMED.2613.77421cc")
public class GeoLocationConnectorConnectorConfigWsdlProviderAdapter
    extends GeoLocationConnectorProcessAdapter
    implements Disposable, ConnectorMetaDataEnabled, WsdlAdapter
{

    private WSResolver wsResolver;

    @Override
    public void dispose() {
        if (wsResolver == null) {
            return ;
        }
        wsResolver.dispose();
        wsResolver = null;
    }

    @Override
    public List<ServiceDefinition> serviceDefinitions()
        throws Exception
    {
        return ((ConnectorConfig) getConfig()).getServiceDefinitions();
    }

    @Override
    public String endpoint(ServiceDefinition serviceDefinition)
        throws Exception
    {
        return ((ConnectorConfig) getConfig()).getServiceEndpoint(serviceDefinition);
    }

    @Override
    public String wsdlSeparator() {
        return "||";
    }

    @Override
    public List<WsdlSecurityStrategy> security(ServiceDefinition serviceDefinition)
        throws Exception
    {
        return Collections.emptyList();
    }

    @Override
    public WsdlTransport transport(ServiceDefinition serviceDefinition) {
        return null;
    }

    @Override
    public Optional<List<Document>> headers(ServiceDefinition serviceDefinition, String operationName)
        throws Exception
    {
        return Optional.fromNullable(null);
    }

    private synchronized void initializeWsResolver()
        throws Exception
    {
        if (wsResolver == null) {
            wsResolver = new DefaultWSResolver(this);
        }
    }

    @Override
    public WSResolver wsResolver()
        throws Exception
    {
        initializeWsResolver();
        return wsResolver;
    }

    @Override
    public Optional<String> singleServiceDefinitionId()
        throws Exception
    {
        return Optional.absent();
    }

    @Override
    public Result<List<MetaDataKey>> getMetaDataKeys() {
        WsdlMetaDataDescriptor wsdlMetaDataResolver = new WsdlMetaDataDescriptor();
        return wsdlMetaDataResolver.getMetaDataKeys(this);
    }

    @Override
    public Result<MetaData> getMetaData(MetaDataKey metaDataKey) {
        WsdlMetaDataDescriptor wsdlMetaDataResolver = new WsdlMetaDataDescriptor();
        return wsdlMetaDataResolver.getMetaData(metaDataKey, this);
    }

}
