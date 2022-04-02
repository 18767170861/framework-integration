package org.wmc.dto;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class KillDto implements Serializable{

    @NotNull
    private Integer killId;

    private Integer userId;
}