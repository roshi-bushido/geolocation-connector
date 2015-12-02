
package org.mule.modules.geolocation.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.geolocation.GeoLocationConnector;


/**
 * A <code>GeoLocationConnectorCapabilitiesAdapter</code> is a wrapper around {@link GeoLocationConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.1", date = "2015-12-02T07:42:56-03:00", comments = "Build UNNAMED.2613.77421cc")
public class GeoLocationConnectorCapabilitiesAdapter
    extends GeoLocationConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
