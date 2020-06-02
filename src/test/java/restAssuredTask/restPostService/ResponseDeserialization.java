package restAssuredTask.restPostService;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDeserialization {

    @JsonProperty
    private String FaultId;
    @JsonProperty
    private String fault;

    public String getFaultId() {
        return FaultId;
    }

    public void setFaultId(String FaultId) {
        this.FaultId = FaultId;
    }

    public String getfault() {
        return fault;
    }

    public void setfault(String fault) {
        this.fault = fault;
    }
}
