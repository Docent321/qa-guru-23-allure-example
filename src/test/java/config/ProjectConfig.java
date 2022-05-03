package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:${type}.properties"})
//@Config.Sources({
//        "classpath:remote.properties",
//        "classpath:local.properties"
//})
public interface ProjectConfig extends Config {

    @Key("browserName")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();

    @Key("videoStorage")
    String videoStorage();

    @Key("timeoutVideoAttach")
    int timeoutVideoAttach();

    @Key("timeout")
    int timeout();

    @Key("threads")
    int threads();
}