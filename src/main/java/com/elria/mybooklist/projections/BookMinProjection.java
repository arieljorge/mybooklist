package com.elria.mybooklist.projections;

public interface BookMinProjection {

    Long getId();
    String getTitle();
    String getImgUrl();
    String getShortDescription();
    String getGenres();
    Double getScore();
    Integer getPosition();
}
