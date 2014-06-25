/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vc.pq.common;

import java.io.IOException;
import org.jsoup.Jsoup;

/**
 *
 * @author Ivan Kazakov
 * @mailto m@pq.vc
 */
public class HTTPTool {
    
    /**Get response code
     * 
     * @param address address, like http://pq.vc:80/
     * @return response code, int
     * @throws IOException 
     */
    public static int getResponseCode(String address) throws IOException{
        return Jsoup.connect(address).execute().statusCode();
    }
}
