package com.example.pill_info.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class sum_pillinfo {
    @Id
    @Column
    private Long same_id;
    private String ITEM_SEQ;
    private  sum_pillinfo() {}
    private String ITEM_NAME;
    private String ITEM_IMAGE;
    private String PRINT_FRONT;
    private String PRINT_BACK;
    private String DRUG_SHAPE;
    private String COLOR_CLASS1;
    private String COLOR_CLASS2;
    private String LINE_FRONT;
    private String LINE_BACK;
    private String CLASS_NO;
    private String CLASS_NAME;
    private String ITEM_PERMIT_DATE;
    private String FORM_CODE_NAME;
    private String entpName;
    private String efcyQesitm;
    private String useMethodQesitm;
    private String atpnWarnQesitm;
    private String atpnQesitm;
    private String intrcQesitm;
    private String seQesitm;
    private String depositMethodQesitm;

    public sum_pillinfo(Long same_id,String ITEM_SEQ,String ITEM_NAME,String ITEM_IMAGE, String PRINT_FRONT,String PRINT_BACK,String DRUG_SHAPE,
                    String COLOR_CLASS1,String COLOR_CLASS2,String LINE_FRONT,String LINE_BACK,String CLASS_NO, String CLASS_NAME,
                    String ITEM_PERMIT_DATE,String FORM_CODE_NAME,String entpName,String efcyQesitm,String useMethodQesitm,
                    String atpnWarnQesitm,String intrcQesitm,String atpnQesitm,String seQesitm,String depositMethodQesitm) {
        super();
        this.same_id = same_id;
        this.ITEM_SEQ = ITEM_SEQ;
        this.ITEM_NAME = ITEM_NAME;
        this.ITEM_IMAGE = ITEM_IMAGE;
        this.PRINT_FRONT = PRINT_FRONT;
        this.PRINT_BACK = PRINT_BACK;
        this.DRUG_SHAPE = DRUG_SHAPE;
        this.COLOR_CLASS1 = COLOR_CLASS1;
        this.COLOR_CLASS2 = COLOR_CLASS2;
        this.LINE_FRONT = LINE_FRONT;
        this.LINE_BACK = LINE_BACK;
        this.CLASS_NO = CLASS_NO;
        this.CLASS_NAME = CLASS_NAME;
        this.ITEM_PERMIT_DATE = ITEM_PERMIT_DATE;
        this.FORM_CODE_NAME = FORM_CODE_NAME;
        this.entpName=entpName;
        this.efcyQesitm=efcyQesitm;
        this.useMethodQesitm=useMethodQesitm;
        this.atpnWarnQesitm=atpnWarnQesitm;
        this.intrcQesitm=intrcQesitm;
        this.atpnQesitm=atpnQesitm;
        this.seQesitm=seQesitm;
        this.depositMethodQesitm=depositMethodQesitm;
    }
}

