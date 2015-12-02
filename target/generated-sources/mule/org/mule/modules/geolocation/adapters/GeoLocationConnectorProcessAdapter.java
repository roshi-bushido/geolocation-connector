
package org.mule.modules.geolocation.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.geolocation.GeoLocationConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>GeoLocationConnectorProcessAdapter</code> is a wrapper around {@link GeoLocationConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.1", date = "2015-12-02T07:42:56-03:00", comments = "Build UNNAMED.2613.77421cc")
public class GeoLocationConnectorProcessAdapter
    extends GeoLocationConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<GeoLocationConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, GeoLocationConnectorCapabilitiesAdapter> getProcessTemplate() {
        final GeoLocationConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,GeoLocationConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, GeoLocationConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, GeoLocationConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
