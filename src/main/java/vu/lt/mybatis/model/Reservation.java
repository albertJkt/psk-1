package vu.lt.mybatis.model;

import java.util.Date;

public class Reservation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RESERVATION.ID
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RESERVATION.STARTDATE
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    private Date startdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RESERVATION.ENDDATE
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    private Date enddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RESERVATION.ROOM_ID
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    private Integer roomId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RESERVATION.ID
     *
     * @return the value of PUBLIC.RESERVATION.ID
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RESERVATION.ID
     *
     * @param id the value for PUBLIC.RESERVATION.ID
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RESERVATION.STARTDATE
     *
     * @return the value of PUBLIC.RESERVATION.STARTDATE
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RESERVATION.STARTDATE
     *
     * @param startdate the value for PUBLIC.RESERVATION.STARTDATE
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RESERVATION.ENDDATE
     *
     * @return the value of PUBLIC.RESERVATION.ENDDATE
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RESERVATION.ENDDATE
     *
     * @param enddate the value for PUBLIC.RESERVATION.ENDDATE
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RESERVATION.ROOM_ID
     *
     * @return the value of PUBLIC.RESERVATION.ROOM_ID
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RESERVATION.ROOM_ID
     *
     * @param roomId the value for PUBLIC.RESERVATION.ROOM_ID
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }
}