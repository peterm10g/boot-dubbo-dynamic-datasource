package com.lsh.boot.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Project Name: boot-demo
 * Created by peter on 18/10/28.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    private String id;

    private String name;
}
