package com.zyc.travel.model.mapper;

import com.zyc.travel.model.dto.JTravelAgencyContacts;
import com.zyc.travel.model.dto.JTravelAgencyContactsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JTravelAgencyContactsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_agency_contacts
     *
     * @mbggenerated Mon Jan 23 18:25:02 CST 2017
     */
    int countByExample(JTravelAgencyContactsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_agency_contacts
     *
     * @mbggenerated Mon Jan 23 18:25:02 CST 2017
     */
    int deleteByExample(JTravelAgencyContactsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_agency_contacts
     *
     * @mbggenerated Mon Jan 23 18:25:02 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_agency_contacts
     *
     * @mbggenerated Mon Jan 23 18:25:02 CST 2017
     */
    int insert(JTravelAgencyContacts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_agency_contacts
     *
     * @mbggenerated Mon Jan 23 18:25:02 CST 2017
     */
    int insertSelective(JTravelAgencyContacts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_agency_contacts
     *
     * @mbggenerated Mon Jan 23 18:25:02 CST 2017
     */
    List<JTravelAgencyContacts> selectByExample(JTravelAgencyContactsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_agency_contacts
     *
     * @mbggenerated Mon Jan 23 18:25:02 CST 2017
     */
    JTravelAgencyContacts selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_agency_contacts
     *
     * @mbggenerated Mon Jan 23 18:25:02 CST 2017
     */
    int updateByExampleSelective(@Param("record") JTravelAgencyContacts record, @Param("example") JTravelAgencyContactsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_agency_contacts
     *
     * @mbggenerated Mon Jan 23 18:25:02 CST 2017
     */
    int updateByExample(@Param("record") JTravelAgencyContacts record, @Param("example") JTravelAgencyContactsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_agency_contacts
     *
     * @mbggenerated Mon Jan 23 18:25:02 CST 2017
     */
    int updateByPrimaryKeySelective(JTravelAgencyContacts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table j_travel_agency_contacts
     *
     * @mbggenerated Mon Jan 23 18:25:02 CST 2017
     */
    int updateByPrimaryKey(JTravelAgencyContacts record);
}