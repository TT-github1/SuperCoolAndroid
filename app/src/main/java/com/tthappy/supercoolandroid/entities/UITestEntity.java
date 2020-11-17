package com.tthappy.supercoolandroid.entities;

import java.util.List;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/9 13:21
 * Update Date:
 * Modified By:
 * Description:
 */
public class UITestEntity {
    private String id;
    private String originalName;
    private int imdbVotes;
    private String imdbRating;
    private int rottenVotes;
    private String rottenRating;
    private String doubanId;
    private String imdbId;
    private String alias;
    private int doubanVotes;
    private String doubanRating;
    private String year;
    private String type;
    private int duration;
    private String dateReleased;
    private Object totalSeasons;
    private Object episodes;
    private List<DataBean> data;
    private List<DirectorBean> director;
    private List<ActorBean> actor;
    private List<WriterBean> writer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public int getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(int imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getRottenVotes() {
        return rottenVotes;
    }

    public void setRottenVotes(int rottenVotes) {
        this.rottenVotes = rottenVotes;
    }

    public String getRottenRating() {
        return rottenRating;
    }

    public void setRottenRating(String rottenRating) {
        this.rottenRating = rottenRating;
    }

    public String getDoubanId() {
        return doubanId;
    }

    public void setDoubanId(String doubanId) {
        this.doubanId = doubanId;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getDoubanVotes() {
        return doubanVotes;
    }

    public void setDoubanVotes(int doubanVotes) {
        this.doubanVotes = doubanVotes;
    }

    public String getDoubanRating() {
        return doubanRating;
    }

    public void setDoubanRating(String doubanRating) {
        this.doubanRating = doubanRating;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDateReleased() {
        return dateReleased;
    }

    public void setDateReleased(String dateReleased) {
        this.dateReleased = dateReleased;
    }

    public Object getTotalSeasons() {
        return totalSeasons;
    }

    public void setTotalSeasons(Object totalSeasons) {
        this.totalSeasons = totalSeasons;
    }

    public Object getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Object episodes) {
        this.episodes = episodes;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public List<DirectorBean> getDirector() {
        return director;
    }

    public void setDirector(List<DirectorBean> director) {
        this.director = director;
    }

    public List<ActorBean> getActor() {
        return actor;
    }

    public void setActor(List<ActorBean> actor) {
        this.actor = actor;
    }

    public List<WriterBean> getWriter() {
        return writer;
    }

    public void setWriter(List<WriterBean> writer) {
        this.writer = writer;
    }

    public static class DataBean {
        /**
         * genre : 喜剧/剧情/爱情
         * name : 喜剧之王
         * lang : Cn
         * language : 粤语
         * poster : https://image.querydata.org/movie/poster/1603700644142-bfg461.jpg
         * description : 尹天仇（周星驰 饰）一直醉心戏剧，想成为一名演员，平时除了做跑龙套以外，还会在街坊福利会里开设演员训练班。此时舞小姐柳飘飘在妈妈桑的带领下来到这里要求学做戏，原来柳飘飘有一段非常不愉快的经历，在尹天仇...
         * country : 中国香港
         */

        private String genre;
        private String name;
        private String lang;
        private String language;
        private String poster;
        private String description;
        private String country;

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getPoster() {
            return poster;
        }

        public void setPoster(String poster) {
            this.poster = poster;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }

    public static class DirectorBean {
        private List<DataBeanX> data;

        public List<DataBeanX> getData() {
            return data;
        }

        public void setData(List<DataBeanX> data) {
            this.data = data;
        }

        public static class DataBeanX {
            /**
             * name : 周星驰
             * lang : Cn
             */

            private String name;
            private String lang;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLang() {
                return lang;
            }

            public void setLang(String lang) {
                this.lang = lang;
            }
        }
    }

    public static class ActorBean {
        private List<DataBeanXX> data;

        public List<DataBeanXX> getData() {
            return data;
        }

        public void setData(List<DataBeanXX> data) {
            this.data = data;
        }

        public static class DataBeanXX {
            /**
             * name : 吴孟达
             * lang : Cn
             */

            private String name;
            private String lang;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLang() {
                return lang;
            }

            public void setLang(String lang) {
                this.lang = lang;
            }
        }
    }

    public static class WriterBean {
        private List<DataBeanXXX> data;

        public List<DataBeanXXX> getData() {
            return data;
        }

        public void setData(List<DataBeanXXX> data) {
            this.data = data;
        }

        public static class DataBeanXXX {
            /**
             * name : 周星驰
             * lang : Cn
             */

            private String name;
            private String lang;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLang() {
                return lang;
            }

            public void setLang(String lang) {
                this.lang = lang;
            }
        }
    }
}
