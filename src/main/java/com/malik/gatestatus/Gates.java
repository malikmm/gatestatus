package com.malik.gatestatus;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Optional;

@Slf4j
public enum Gates {
    GATE_A("gate A", "open", 1),
    GATE_B("gate B", "closed", 0),
    GATE_C("gate C", "broken", -1);

    private final String name;
    private final String status;
    private final int flag;

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public int getFlag() {
        return flag;
    }



    Gates(String name, String status, int flag) {
        this.name = name;
        this.status = status;
        this.flag = flag;
    }

    // Reverse lookup methods
    public static Optional<Gates> getEnumEvaluationByValue(String value) {
        return Arrays.stream(Gates.values())
                .filter(gates -> gates.status.equals(value)
                        || gates.name.equals(value))
                .findFirst();
    }

    public static Optional<Gates> getEnumEvaluationByValue(int value) {
        return Arrays.stream(Gates.values())
                .filter(gates -> gates.flag == value)
                .findFirst();
    }

    public static void getGateData(){
        for(Gates gate : Gates.values()){
            log.info("Status: " + gate.getName() + " is : " + gate.getStatus());
        }
    }
}
