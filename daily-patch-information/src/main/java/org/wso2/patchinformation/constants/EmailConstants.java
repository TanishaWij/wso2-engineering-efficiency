//
// Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
//
// WSO2 Inc. licenses this file to you under the Apache License,
// Version 2.0 (the "License"); you may not use this file except
// in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//
package org.wso2.patchinformation.constants;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.gmail.GmailScopes;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

/**
 * Email constant values
 */
public final class EmailConstants {

    public static final String APPLICATION_NAME = "Patch Information Emailer";
    public static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    public static final String CREDENTIALS_FOLDER = "gmail-credentials";
    public static final List<String> SCOPES = Collections.singletonList(GmailScopes.GMAIL_SEND);
    public static final String CLIENT_SECRET_DIR = "/clientSecret.json";

    public static final String MAIN_HEADER_INTERNAL =
            "<html>\n" +
                    "   <head>\n" +
                    "      <title></title>\n" +
                    "   </head>\n" +
                    "   <body>\n" +
                    "      <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" " +
                    "style=\"max-width:100%;\">\n" +
                    "      <tr>\n" +
                    "         <td align=\"center\" style=\"font-family: Helvetica, Arial, sans-serif; font-size:" +
                    " 18px;" +
                    " font-weight: 400; line-height: 15px; padding-top: 0px;\">\n" +
                    "            <p style=\"font-size: 24px; font-weight: 600; line-height: 26px; color: #000000;\">" +
                    "Proactive Patches as of " + LocalDate.now() + " : Ongoing - ";

    public static final String MAIN_HEADER_CUSTOMER =
            "<html>\n" +
                    "   <head>\n" +
                    "      <title></title>\n" +
                    "   </head>\n" +
                    "   <body>\n" +
                    "      <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" " +
                    "style=\"max-width:100%;\">\n" +
                    "      <tr>\n" +
                    "         <td align=\"center\" style=\"font-family: Helvetica, Arial, sans-serif; font-size: " +
                    "18px;" +
                    " font-weight: 400; line-height: 15px; padding-top: 0px;\">\n" +
                    "            <p style=\"font-size: 24px; font-weight: 600; line-height: 26px; color: #000000;\">" +
                    "Customer Patches as of " + LocalDate.now() + " : Ongoing - ";

    public static final String MAIN_HEADER_END =  "</p>\n</td>\n" +
            "      </tr>\n" +
            "      </table>";

    public static final String COLUMN_NAMES_SUMMARY = "<table align=\"center\" cellspacing=\"0\" cellpadding=\"0\"" +
            " border=\"0\" width=\"95%\">" +
            "<tr>" +
            " <td width=\"30%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\">" +
            "JIRA Issue" +
            " </td>" +
            "<td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family: " +
            "Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\">" +
            "Assignee" +
            "</td>" +
            "<td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family: " +
            "Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\">" +
            "Open Patches" +
            "</td>" +
            " <td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px;" +
            " padding: 10px;\">" +
            "Date Reported" +
            "</td>" +
            "</tr>";

    public static final String COLUMN_NAMES = "<table align=\"center\" cellspacing=\"0\" " +
            "cellpadding=\"0\" border=\"0\" width=\"95%\">" +
            "<tr>" +
            " <td width=\"30%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height:" +
            " 20px; padding: 10px;\">" +
            "JIRA Issue" +
            " </td>" +
            "<td width=\"20%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family: " +
            "Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\">" +
            "Patch Name" +
            "</td>" +
            "<td width=\"15%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: " +
            "20px; padding: 10px;\">" +
            "Product" +
            "</td>" +
            "<td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family: " +
            "Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\">" +
            "Assignee" +
            "</td>" +
            " <td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height:" +
            " 20px; padding: 10px;\">" +
            "LC State </td>" +
            "<td width=\"15%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height:" +
            " 20px; padding: 10px;\">";

    public static final String COLUMN_NAMES_INACTIVE = "<table align=\"center\" cellspacing=\"0\" " +
            "cellpadding=\"0\" border=\"0\" width=\"95%\">" +
            "<tr>" +
            " <td width=\"15%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height:" +
            " 20px; padding: 10px;\">" +
            "JIRA Issue" +
            " </td>" +
            "<td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family: " +
            "Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\">" +
            "Patch Name" +
            "</td>" +
            "<td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: " +
            "20px; padding: 10px;\">" +
            "Product" +
            "</td>" +
            "<td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family: " +
            "Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\">" +
            "Assignee" +
            "</td>" +
            " <td width=\"7%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height:" +
            " 20px; padding: 10px;\">" +
            "JIRA State" +
            " </td>" +
            " <td width=\"7%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height:" +
            " 20px; padding: 10px;\">" +
            "LC State </td>" +
            "<td width=\"7%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height:" +
            " 20px; padding: 10px;\">";

    public static final String COLUMN_NAMES_DEV = "<table align=\"center\" cellspacing=\"0\" " +
            "cellpadding=\"0\" border=\"0\" width=\"95%\">" +
            "<tr><td width=\"20%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family: " +
            "Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\"> JIRA Issue</td><td width=\"20%\" align=\"center\" color=\"#044767\"" +
            " bgcolor=\"#bebebe\" style=\"font-family: Open Sans," +
            " Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\">Patch Name" +
            "</td>" +
            "<td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family: " +
            "Open Sans,Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\"> Product </td>" +
            "<td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, " +
            "Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; padding: " +
            "10px;\"> Assignee </td>" +
            " <td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family: " +
            "Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\"> " +
            "LC State </td>" + "<td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" " +
            "style=\"font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; " +
            "line-height: 20px; padding: 10px;\">" +
            "Reported Date" +
            "<td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family: " +
            "Open Sans, " +
            "Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: " +
            "20px; padding: 10px;\">";

    public static final String COLUMN_NAMES_RELEASED = "<table align=\"center\" cellspacing=\"0\" cellpadding=\"0\"" +
            " border=\"0\" width=\"95%\">" +
            "<tr>" +
            " <td width=\"30%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\">" +
            "JIRA Issue" +
            " </td>" +
            "<td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family: " +
            "Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\">" +
            "Assignee" +
            "</td>" +
            "<td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family: " +
            "Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px; " +
            "padding: 10px;\">" +
            "Released Patches" +
            "</td>" +
            " <td width=\"10%\" align=\"center\" color=\"#044767\" bgcolor=\"#bebebe\" style=\"font-family:" +
            " Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 800; line-height: 20px;" +
            " padding: 10px;\">" +
            "Date Reported" +
            "</td>" +
            "</tr>";

    public static final String EMAIL_SUBJECT_INTERNAL = "[Ongoing Patches][Proactive] Proactive Patch Information: " +
            LocalDate.now();
    public static final String EMAIL_SUBJECT_CUSTOMER = "[Ongoing Patches][Customer] Customer " +
            "Patch Information: " + LocalDate.now();
    public static final String SECTION_HEADER_SUMMARY = "<br><p align=\"center\"style=\"font-size: 20px; " +
            "font-weight: 600; line-height: 26px; color: #000000;\">Summary of Patch Related JIRAs</p>";
    public static final String SECTION_HEADER_INACTIVE = "<br><p align=\"center\"style=\"font-size: 20px; " +
            "font-weight: 600; line-height: 26px; color: #000000;\">JIRAs Tagged with Patch Label Having No Ongoing " +
            "Patches</p>";
    public static final String SECTION_HEADER_DEV = "<br><p align=\"center\"style=\"font-size: 20px; " +
            "font-weight: 600; line-height: 26px; color: #000000;\">Patches in Development</p>";
    public static final String SECTION_HEADER_SIGNING = "<br><p align=\"center\"style=\"font-size: 20px;" +
            " font-weight: 600; line-height: 26px; color: #000000;\">Patches Sent for Signing</p>";
    public static final String SECTION_HEADER_RELEASED = "<br><p align=\"center\"style=\"font-size: 20px; " +
            "font-weight: 600; line-height: 26px; color: #000000;\"> Released Patches with an Unresolved" +
            " JIRA Issue</p>";
    public static final String EMAIL_TYPE = "text/html";


    public static final String EMAIL_FOOTER = "<br><br><table align=\"center\" border=\"0\" cellpadding=\"0\" " +
            "cellspacing=\"0\" width=\"100%\" style=\"max-width:600px;\">\n" +
            "   <tr>\n" +
            "      <td align=\"center\">                           \n" +
            "         <img src=\"https://upload.wikimedia.org/wikipedia/en/5/56/WSO2_Software_Logo.png\" " +
            "width=\"90\" height=\"37\" style=\"display: block; border: 0px;\"/>                        \t  \n" +
            "      </td>\n" +
            "   </tr>\n" +
            "   <tr>\n" +
            "      <td align=\"center\" style=\"font-family: Open Sans, Helvetica, Arial, sans-serif; " +
            "font-size: 14px; font-weight: 400; line-height: 24px;\">\n" +
            "         <p style=\"font-size: 14px; font-weight: 400; line-height: 20px;" +
            " color: #777777;\">Copyright (c) 2018 | WSO2 Inc.<br/>All Right Reserved.                 " +
            "                     \t\t   </p>\n" +
            "      </td>\n" +
            "   </tr>\n" +
            "</table>\n" +
            "</body></html>\n";
    private EmailConstants() {

    }
}
