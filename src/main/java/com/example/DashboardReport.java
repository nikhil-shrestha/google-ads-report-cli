package com.example;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DashboardReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    private Date Dimension_DATE;
    private Double TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS;
    private Double TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS;
    private Double TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE;
    private Double TOTAL_AD_REQUESTS;
    private Double TOTAL_RESPONSES_SERVED;
    private Double AD_SERVER_CLICKS;

    public DashboardReport() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDimension_DATE(Date dimension_DATE) {
        Dimension_DATE = dimension_DATE;
    }

    public void setTOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS(String TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS) {
        this.TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS = Double.parseDouble(TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS);
    }


    public void setTOTAL_LINE_ITEM_LEVEL_IMPRESSIONS(String TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS) {
        this.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS = Double.parseDouble(TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS);
    }

    public void setAD_SERVER_CLICKS(String AD_SERVER_CLICKS) {
        this.AD_SERVER_CLICKS = Double.parseDouble(AD_SERVER_CLICKS);
    }

    public void setTOTAL_AD_REQUESTS(String TOTAL_AD_REQUESTS) {
        this.TOTAL_AD_REQUESTS = Double.parseDouble(TOTAL_AD_REQUESTS);
    }

    public void setTOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE(String TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE) {
        this.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE = Double.parseDouble(TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE);
    }

    public void setTOTAL_RESPONSES_SERVED(String TOTAL_RESPONSES_SERVED) {
        this.TOTAL_RESPONSES_SERVED = Double.parseDouble(TOTAL_RESPONSES_SERVED);
    }
}
