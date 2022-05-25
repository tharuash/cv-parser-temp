package com.b127.dev;

import lombok.*;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ExtendedCandidate {

    private String email;
    private String phone;
    private String education;
    private String aboutMe;
    private String filePath;
    private City city;
    private List<Map<String, String>> skills;
}
