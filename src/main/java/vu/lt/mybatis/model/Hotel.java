package vu.lt.mybatis.model;

public class Hotel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.HOTEL.ID
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.HOTEL.NAME
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.HOTEL.ADDRESS
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.HOTEL.ID
     *
     * @return the value of PUBLIC.HOTEL.ID
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.HOTEL.ID
     *
     * @param id the value for PUBLIC.HOTEL.ID
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.HOTEL.NAME
     *
     * @return the value of PUBLIC.HOTEL.NAME
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.HOTEL.NAME
     *
     * @param name the value for PUBLIC.HOTEL.NAME
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.HOTEL.ADDRESS
     *
     * @return the value of PUBLIC.HOTEL.ADDRESS
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.HOTEL.ADDRESS
     *
     * @param address the value for PUBLIC.HOTEL.ADDRESS
     *
     * @mbg.generated Wed Apr 24 00:33:13 EEST 2019
     */
    public void setAddress(String address) {
        this.address = address;
    }
}