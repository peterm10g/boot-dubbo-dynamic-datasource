package com.lsh.boot.provider.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Project Name: servicecloud
 *
 * @author peter
 * @date 18/9/15
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private static final long serialVersionUID = 4590025340440586958L;

    /**
     *
     */
    private Integer id;
    /**
     *
     */
    private Integer num;
    /**
     *
     */
    private Integer pid;
    /**
     *
     */
    private String pids;
    /**
     *
     */
    private String simplename;
    /**
     *
     */
    private String fullname;
    /**
     *
     */
    private String tips;
    /**
     *
     */
    private Integer version;

}
