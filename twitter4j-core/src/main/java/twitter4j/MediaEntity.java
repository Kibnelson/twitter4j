/*
 * Copyright 2007 Yusuke Yamamoto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package twitter4j;

import java.net.URL;
import java.util.Map;

/**
 * @author Yusuke Yamamoto - yusuke at mac.com
 * @since Twitter4J 2.2.3
 */
public interface MediaEntity extends java.io.Serializable {
    /**
     * Returns the id of the media.
     *
     * @return the id of the media
     */
    long getId();

    /**
     * Returns the media URL.
     *
     * @return the media URL
     */
    URL getMediaURL();

    /**
     * Returns the media secure URL.
     *
     * @return the media secure URL
     */
    URL getMediaURLHttps();

    /**
     * Returns the URL.
     *
     * @return the URL
     */
    URL getURL();

    /**
     * Returns the display URL if mentioned URL is shorten.
     *
     * @return the display URL if mentioned URL is shorten, or null if no shorten URL was mentioned.
     */
    String getDisplayURL();

    /**
     * Returns the expanded URL if mentioned URL is shorten.
     *
     * @return the expanded URL if mentioned URL is shorten, or null if no shorten URL was mentioned.
     */
    URL getExpandedURL();

    /**
     * Returns size variations of the media.
     *
     * @return size variations of the media
     */
    Map<Integer, Size> getSizes();

    /**
     * Returns the index of the start character of the URL mentioned in the tweet.
     *
     * @return the index of the start character of the URL mentioned in the tweet
     */
    int getStart();

    /**
     * Returns the index of the end character of the URL mentioned in the tweet.
     *
     * @return the index of the end character of the URL mentioned in the tweet
     */
    int getEnd();

    interface Size extends java.io.Serializable {
        Integer THUMB = 0;
        Integer SMALL = 1;
        Integer MEDIUM = 2;
        Integer LARGE = 3;
        int FIT = 100;
        int CROP = 101;

        int getWidth();

        int getHeight();

        int getResize();
    }
}
