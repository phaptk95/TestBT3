package QLCuaHang;
import java.util.*;
import java.lang.*;

@Entity
@Table(name="tbl_nhomhang",  uniqueConstraints = {@UniqueConstraints(columnNames = {"NH_ID"})})
public class NhomHang {
private Integer NHID;
private String NH_Ten;

}
