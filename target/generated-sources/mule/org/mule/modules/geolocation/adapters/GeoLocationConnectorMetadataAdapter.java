
package org.mule.modules.geolocation.adapters;

import javax.annotation.Generated;
import org.mule.api.MetadataAware;
import org.mule.modules.geolocation.GeoLocationConnector;


/**
 * A <code>GeoLocationConnectorMetadataAdapter</code> is a wrapper around {@link GeoLocationConnector } that adds support for querying metadata about the extension.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.1", date = "2015-12-02T07:42:56-03:00", comments = "Build UNNAMED.2613.77421cc")
public class GeoLocationConnectorMetadataAdapter
    extends GeoLocationConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "GeoLocation";
    private final static String MODULE_VERSION = "1.0.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.7.1";
    private final static String DEVKIT_BUILD = "UNNAMED.2613.77421cc";
    private final static String MIN_MULE_VERSION = "3.7";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}
