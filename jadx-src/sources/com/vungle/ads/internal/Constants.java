package com.vungle.ads.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000200X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/vungle/ads/internal/Constants;", "", "()V", "AD_CLOSE", "", "AD_DURATION_KEY", "AD_LOAD_DURATION", "AD_LOAD_DURATION_KEY", "AD_PODDING_KEY", "AD_VISIBILITY_INVISIBLE", "", "AD_VISIBILITY_VISIBLE", "AD_VISIBILITY_VISIBLE_LATER", "CHECKPOINT_0", "CLICK_URL", "COORDINATE", "CP_0_NOT_FIRED", "CTA_URL", "DEEPLINK_CLICK", "DEEPLINK_SUCCESS_KEY", "DEFAULT_ADS_ENDPOINT", "DEFAULT_ERROR_LOGS_ENDPOINT", "DEFAULT_METRICS_ENDPOINT", "DEVICE_VOLUME_KEY", "EXPERIMENTS_KEY", "GOOGLE_PLAY_PACKAGE", "IMPRESSION", "INLINE_INSTALL_STATUS_FAILURE", "INLINE_INSTALL_STATUS_SUCCESS", "KEY_MAIN_VIDEO", "KEY_PRIVACY_ICON_URL", "LOAD_AD", "LO_PRIVACY_ICON_STRING", "NATIVE_PLAY_ASSET_TYPE_IMAGE", "NATIVE_PLAY_ASSET_TYPE_VIDEO", "NETWORK_OPERATOR_KEY", "OM_SDK_JS", "OM_SESSION_JS", "PLACEMENT_TYPE_APP_OPEN", "PLACEMENT_TYPE_BANNER", "PLACEMENT_TYPE_INTERSTITIAL", "PLACEMENT_TYPE_IN_LINE", "PLACEMENT_TYPE_MREC", "PLACEMENT_TYPE_NATIVE", "PLACEMENT_TYPE_REWARDED", "PRIVACY_ICON_FILE_NAME", "REMOTE_PLAY_KEY", "REQUEST_CODE", "", "SESSION_ID", "TEMPLATE_TYPE_BANNER", "TEMPLATE_TYPE_FULLSCREEN", "TEMPLATE_TYPE_IN_LINE", "TEMPLATE_TYPE_MREC", "TEMPLATE_TYPE_NATIVE", "TIMEOUT", "TPAT_CHECKPOINT_100", "TPAT_CHECKPOINT_25", "TPAT_CHECKPOINT_50", "TPAT_CHECKPOINT_75", "TPAT_CLICK_COORDINATES", "TPAT_VIDEO_CLOSE", "TPAT_VIDEO_MUTE", "TPAT_VIDEO_UNMUTE", "VIDEO_LENGTH_KEY", "VIDEO_LENGTH_TPAT", "WIN_NOTIFICATION", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Constants {
    public static final String AD_CLOSE = "ad.close";
    public static final String AD_DURATION_KEY = "{{{dur}}}";
    public static final String AD_LOAD_DURATION = "ad.loadDuration";
    public static final String AD_LOAD_DURATION_KEY = "{{{time_dl}}}";
    public static final String AD_PODDING_KEY = "AD_PODDING";
    public static final long AD_VISIBILITY_INVISIBLE = 1;
    public static final long AD_VISIBILITY_VISIBLE = 2;
    public static final long AD_VISIBILITY_VISIBLE_LATER = 3;
    public static final String CHECKPOINT_0 = "checkpoint.0";
    public static final String CLICK_URL = "clickUrl";
    public static final String COORDINATE = "coordinate";
    public static final long CP_0_NOT_FIRED = 1;
    public static final String CTA_URL = "cta_url";
    public static final String DEEPLINK_CLICK = "deeplink.click";
    public static final String DEEPLINK_SUCCESS_KEY = "{{{is_success}}}";
    public static final String DEVICE_VOLUME_KEY = "{{{vol}}}";
    public static final String EXPERIMENTS_KEY = "OBSERVED_EXPERIMENTS";
    public static final String GOOGLE_PLAY_PACKAGE = "com.android.vending";
    public static final String IMPRESSION = "impression";
    public static final long INLINE_INSTALL_STATUS_FAILURE = 2;
    public static final long INLINE_INSTALL_STATUS_SUCCESS = 1;
    public static final String KEY_MAIN_VIDEO = "MAIN_VIDEO";
    public static final String KEY_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";
    public static final String LOAD_AD = "load_ad";
    public static final String LO_PRIVACY_ICON_STRING = "iVBORw0KGgoAAAANSUhEUgAAABQAAAAUCAYAAACNiR0NAAAAAXNSR0IArs4c6QAAAIRlWElmTU0AKgAAAAgABQESAAMAAAABAAEAAAEaAAUAAAABAAAASgEbAAUAAAABAAAAUgEoAAMAAAABAAIAAIdpAAQAAAABAAAAWgAAAAAAAABIAAAAAQAAAEgAAAABAAOgAQADAAAAAQABAACgAgAEAAAAAQAAABSgAwAEAAAAAQAAABQAAAAAQeed/gAAAAlwSFlzAAALEwAACxMBAJqcGAAAABxpRE9UAAAAAgAAAAAAAAAKAAAAKAAAAAoAAAAKAAAB9+x9rI0AAAHDSURBVDgRfJJLSwJhFIb7Af2G/kEEQVAEFdQigjYtWhW0CVq0CdpUIFKEYZhYylgpZSEThggWJhUmlJGSBRmB2hUbbyUyONPYePnyLWaQyGY4zOGc933O+fimru6PRyBCQ4EUej9LhSk2x9FMNHnLPKSukaOGHjR/WH9KaULqxaI4yvH8ZprJ+ML+x/AZfRm1K9xB4/COW929uo1Ajhp60EALj1gSx8CQB6DoMV3E10dsx5o+k22uzWBSNuv0iibt8kyjRotvdY4eNNDCAy8YMjAWiUckyHy7wYiASTdgsbqWvOcBRyiCQI4aetU6eF/u4vcy8Dn0GlV1Uhvfog7jqrJFZ3AueE6zGVYUSZFUB2r7ix4fNPMVLTzwgiEDQVd1UZvSZo65Qy8g+eIn4fMCyXF8GcHxH9/5ezKbtyvdHmnTmsDZ1hVK02e2vCeyPIAAY1NBzBPAypX36SaW0A9u00w4ldH2b2zBUxOIiZgMWOU3YXEkdc+aOfHylsOGJ2b/FfoYyrJcUdqyJhA3CRM2OaJ8AXrSeWCdcLp8dDCES8FG2BhAaQA8/wIBwobGIdqGoyEs4449gHanXYc4qgSE9jfwCwAA//+KFItXAAABtklEQVR9UUtLAmEU9Tf0N1oEQVBID6hVUcto07Jdm2jVJqSQoDCpFC20MgkLAu2BCEm0SBf2Qu2tkaGmpSnjzDjjODl9R/iizJrhcl/nHO69n0pFvuebl+hMl2ld07xg2Bzbc0fOYilth3nZv31x7XOch2d7Vqzu+WO/vn9twzbq3Eeef2ckxODMdJrWYuFEBFrVrypIilq10QyhgDP8EAvGM6JcUgRJVG5Poonk4ysDH/TeJQk+h7iKJ5xfgslI+mq2e9kOgKZlwWgYtDuyqTwvKbLCi4JChZFXyJ9J5jhggAUH20GDDqhiWd5pHt7yVAFkQnisd7obiuayjARRGGJMj953LLjQ+BIUZbkv6L1PT7Uumejak036xYlGnV7Xa7VZRnZcq8QQo4YeTgMsOOCKsjjwJYhA+ChpA65QarrNaAHw0OQL0IcACYbJDuaOfOgBAyw44P4Qo0lZKY9fem7jWAv3gmFNPAIMMa3jHMCCQ/l1fVEuDQlySWA5vgLD7fDSMMS0Th5KBLauSG2xUCiqOY5/ouRaj16hILTX8v7NGYZp4DhunOV5HxF8JfaGGDX0/iJ/Apualt8qeDHZAAAAAElFTkSuQmCC";
    public static final long NATIVE_PLAY_ASSET_TYPE_IMAGE = 2;
    public static final long NATIVE_PLAY_ASSET_TYPE_VIDEO = 1;
    public static final String NETWORK_OPERATOR_KEY = "{{{carrier}}}";
    public static final String OM_SDK_JS = "omsdk.js";
    public static final String OM_SESSION_JS = "omsdk-session.js";
    public static final String PLACEMENT_TYPE_APP_OPEN = "appopen";
    public static final String PLACEMENT_TYPE_BANNER = "banner";
    public static final String PLACEMENT_TYPE_INTERSTITIAL = "interstitial";
    public static final String PLACEMENT_TYPE_IN_LINE = "in_line";
    public static final String PLACEMENT_TYPE_MREC = "mrec";
    public static final String PLACEMENT_TYPE_NATIVE = "native";
    public static final String PLACEMENT_TYPE_REWARDED = "rewarded";
    public static final String PRIVACY_ICON_FILE_NAME = "edsp-privacy.png";
    public static final String REMOTE_PLAY_KEY = "{{{remote_play}}}";
    public static final int REQUEST_CODE = 10001;
    public static final String SESSION_ID = "{{{session_id}}}";
    public static final String TEMPLATE_TYPE_BANNER = "banner";
    public static final String TEMPLATE_TYPE_FULLSCREEN = "fullscreen";
    public static final String TEMPLATE_TYPE_IN_LINE = "in_line";
    public static final String TEMPLATE_TYPE_MREC = "mrec";
    public static final String TEMPLATE_TYPE_NATIVE = "native";
    public static final int TIMEOUT = 60;
    public static final String TPAT_CHECKPOINT_100 = "checkpoint.100";
    public static final String TPAT_CHECKPOINT_25 = "checkpoint.25";
    public static final String TPAT_CHECKPOINT_50 = "checkpoint.50";
    public static final String TPAT_CHECKPOINT_75 = "checkpoint.75";
    public static final String TPAT_CLICK_COORDINATES = "video.clickCoordinates";
    public static final String TPAT_VIDEO_CLOSE = "video.close";
    public static final String TPAT_VIDEO_MUTE = "video.mute";
    public static final String TPAT_VIDEO_UNMUTE = "video.unmute";
    public static final String VIDEO_LENGTH_KEY = "{{{vlen}}}";
    public static final String VIDEO_LENGTH_TPAT = "video.length";
    public static final String WIN_NOTIFICATION = "win-notification";
    public static final Constants INSTANCE = new Constants();

    @JvmField
    public static final String DEFAULT_ADS_ENDPOINT = "https://adx.ads.vungle.com/api/v7/ads";

    @JvmField
    public static final String DEFAULT_ERROR_LOGS_ENDPOINT = "https://logs.ads.vungle.com/sdk/error_logs";

    @JvmField
    public static final String DEFAULT_METRICS_ENDPOINT = "https://logs.ads.vungle.com/sdk/metrics";

    private Constants() {
    }
}
