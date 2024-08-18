package lk.ijse.gdse68.introwith_springweb.introwithspringweb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer implements Serializable {
    private String id;
    private String name;
    private String email;

}
