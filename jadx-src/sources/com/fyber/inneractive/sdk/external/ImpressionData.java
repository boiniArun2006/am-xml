package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class ImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pricing f53499a = new Pricing();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Video f53500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f53501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f53502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f53503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f53504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f53505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f53506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f53507i;

    public static class Pricing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f53508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f53509b;

        public String getCurrency() {
            return this.f53509b;
        }

        public double getValue() {
            return this.f53508a;
        }

        public void setValue(double d2) {
            this.f53508a = d2;
        }

        public String toString() {
            return "Pricing{value=" + this.f53508a + ", currency='" + this.f53509b + "'}";
        }
    }

    public static class Video {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f53510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f53511b;

        public long getDuration() {
            return this.f53511b;
        }

        public boolean isSkippable() {
            return this.f53510a;
        }

        public String toString() {
            return "Video{skippable=" + this.f53510a + ", duration=" + this.f53511b + '}';
        }

        public Video(boolean z2, long j2) {
            this.f53510a = z2;
            this.f53511b = j2;
        }
    }

    public String getAdvertiserDomain() {
        return this.f53507i;
    }

    public String getCampaignId() {
        return this.f53506h;
    }

    public String getCountry() {
        return this.f53503e;
    }

    public String getCreativeId() {
        return this.f53505g;
    }

    public Long getDemandId() {
        return this.f53502d;
    }

    public String getDemandSource() {
        return this.f53501c;
    }

    public String getImpressionId() {
        return this.f53504f;
    }

    public Pricing getPricing() {
        return this.f53499a;
    }

    public Video getVideo() {
        return this.f53500b;
    }

    public void setAdvertiserDomain(String str) {
        this.f53507i = str;
    }

    public void setCampaignId(String str) {
        this.f53506h = str;
    }

    public void setCountry(String str) {
        this.f53503e = str;
    }

    public void setCreativeId(String str) {
        this.f53505g = str;
    }

    public void setCurrency(String str) {
        this.f53499a.f53509b = str;
    }

    public void setDemandId(Long l2) {
        this.f53502d = l2;
    }

    public void setDemandSource(String str) {
        this.f53501c = str;
    }

    public void setDuration(long j2) {
        this.f53500b.f53511b = j2;
    }

    public void setImpressionId(String str) {
        this.f53504f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f53499a = pricing;
    }

    public void setVideo(Video video) {
        this.f53500b = video;
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.f53499a + ", video=" + this.f53500b + ", demandSource='" + this.f53501c + "', country='" + this.f53503e + "', impressionId='" + this.f53504f + "', creativeId='" + this.f53505g + "', campaignId='" + this.f53506h + "', advertiserDomain='" + this.f53507i + "'}";
    }

    public void setCpmValue(String str) {
        double d2;
        try {
            d2 = Double.parseDouble(str);
        } catch (Exception unused) {
            d2 = 0.0d;
        }
        this.f53499a.f53508a = d2;
    }
}
