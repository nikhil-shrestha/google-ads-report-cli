package com.example;

import com.opencsv.bean.CsvBindByName;

public class Dashboard1 {
  @CsvBindByName(column = "Dimension.DATE")
  private String date;

  @CsvBindByName(column = "Column.TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS")
  private String unfilledImpression;

  @CsvBindByName(column = "Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS")
  private String impression;

  @CsvBindByName(column = "Column.TOTAL_LINE_ITEM_LEVEL_CLICKS")
  private String clicks;

  @CsvBindByName(column = "Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE")
  private String revenue;

  @CsvBindByName(column = "Column.TOTAL_AD_REQUESTS")
  private String adRequest;

  @CsvBindByName(column = "Column.TOTAL_RESPONSES_SERVED")
  private String served;

  public String getDate() {
    return date;
  }

  public String getUnfilledImpression() {
    return unfilledImpression;
  }

  public String getImpression() {
    return impression;
  }

  public String getClicks() {
    return clicks;
  }

  public String getRevenue() {
    return revenue;
  }

  public String getAdRequest() {
    return adRequest;
  }

  public String getServed() {
    return served;
  }

  @Override
  public String toString() {
    return "Dashboard1{" +
      "date='" + date + '\'' +
      ", unfilledImpression='" + unfilledImpression + '\'' +
      ", impression='" + impression + '\'' +
      ", clicks='" + clicks + '\'' +
      ", revenue='" + revenue + '\'' +
      ", adRequest='" + adRequest + '\'' +
      ", served='" + served + '\'' +
      '}';
  }
}
