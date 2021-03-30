package laby3.zad4;

public enum PcSystem {
    MAC_OS("Big Sur"),
    WINDOWS("10"),
    LINUX("Kali");

    String version;
    int versionNum;

    PcSystem(String version){
        this.version = version;
    }

    public String getVersion(){
        return this.version;
    }
}
