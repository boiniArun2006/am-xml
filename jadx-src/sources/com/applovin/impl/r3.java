package com.applovin.impl;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import androidx.core.database.sqlite.cL.PtsLKY;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.alightcreative.time.Kw.znsSxz;
import com.applovin.impl.b5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class r3 extends x4 {
    public static final x4 A7;
    public static final x4 A8;

    /* JADX INFO: renamed from: B7, reason: collision with root package name */
    public static final x4 f49865B7;
    public static final x4 B8;
    public static final x4 C7;
    public static final x4 C8;
    public static final x4 D7;
    public static final x4 E7;

    /* JADX INFO: renamed from: F7, reason: collision with root package name */
    public static final x4 f49866F7;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    public static final x4 f49867G7;
    public static final x4 H7;
    public static final x4 I7;
    public static final x4 J7;
    public static final x4 K7;
    public static final x4 L7;
    public static final x4 M7;
    public static final x4 N7;
    public static final x4 O7;
    public static final x4 P7;
    public static final x4 Q7;
    public static final x4 R7;
    public static final x4 S7;
    public static final x4 T7;
    public static final x4 U7;
    public static final x4 V7;
    public static final x4 W7;

    /* JADX INFO: renamed from: X7, reason: collision with root package name */
    public static final x4 f49868X7;
    public static final x4 Y7;

    /* JADX INFO: renamed from: Z7, reason: collision with root package name */
    public static final x4 f49869Z7;
    public static final x4 a8;
    public static final x4 b8;
    public static final x4 c8;
    public static final x4 d8;
    public static final x4 e8;
    public static final x4 f8;

    /* JADX INFO: renamed from: g8, reason: collision with root package name */
    public static final x4 f49870g8;
    public static final x4 h8;
    public static final x4 i8;

    /* JADX INFO: renamed from: j8, reason: collision with root package name */
    public static final x4 f49871j8;
    public static final x4 k8;
    public static final x4 l8;
    public static final x4 m7 = x4.a("afi", "");
    public static final x4 m8;

    /* JADX INFO: renamed from: n7, reason: collision with root package name */
    public static final x4 f49872n7;
    public static final x4 n8;
    public static final x4 o7;
    public static final x4 o8;

    /* JADX INFO: renamed from: p7, reason: collision with root package name */
    public static final x4 f49873p7;
    public static final x4 p8;
    public static final x4 q7;
    public static final x4 q8;
    public static final x4 r7;
    public static final x4 r8;
    public static final x4 s7;
    public static final x4 s8;
    public static final x4 t7;
    public static final x4 t8;
    public static final x4 u7;
    public static final x4 u8;
    public static final x4 v7;

    /* JADX INFO: renamed from: v8, reason: collision with root package name */
    public static final x4 f49874v8;
    public static final x4 w7;
    public static final x4 w8;
    public static final x4 x7;
    public static final x4 x8;
    public static final x4 y7;

    /* JADX INFO: renamed from: y8, reason: collision with root package name */
    public static final x4 f49875y8;
    public static final x4 z7;

    /* JADX INFO: renamed from: z8, reason: collision with root package name */
    public static final x4 f49876z8;

    static {
        Boolean bool = Boolean.FALSE;
        f49872n7 = x4.a("iafiwaa", bool);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        o7 = x4.a("afi_ms", Long.valueOf(timeUnit.toMillis(5L)));
        f49873p7 = x4.a("mediation_endpoint", "https://ms.applovin.com/");
        q7 = x4.a("mediation_backup_endpoint", "https://ms.applvn.com/");
        r7 = x4.a("fetch_next_ad_retry_delay_ms", Long.valueOf(timeUnit.toMillis(2L)));
        s7 = x4.a("fetch_next_ad_timeout_ms", Long.valueOf(timeUnit.toMillis(30L)));
        t7 = x4.a("fetch_mediation_debugger_info_timeout_ms", Long.valueOf(timeUnit.toMillis(7L)));
        Boolean bool2 = Boolean.TRUE;
        u7 = x4.a("auto_init_mediation_debugger", bool2);
        v7 = x4.a("postback_macros", pTYaLzzmJSGAPQ.tGa);
        w7 = x4.a("max_signal_provider_latency_ms", Long.valueOf(timeUnit.toMillis(30L)));
        x7 = x4.a("default_adapter_timeout_ms", Long.valueOf(timeUnit.toMillis(10L)));
        y7 = x4.a("ad_refresh_ms", Long.valueOf(timeUnit.toMillis(30L)));
        z7 = x4.a("ad_load_failure_refresh_ms", Long.valueOf(timeUnit.toMillis(30L)));
        A7 = x4.a("ad_load_failure_refresh_ignore_error_codes", "204");
        f49865B7 = x4.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        C7 = x4.a("refresh_ad_view_timer_responds_to_background", bool2);
        D7 = x4.a("refresh_ad_view_timer_responds_to_store_kit", bool2);
        E7 = x4.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool);
        f49866F7 = x4.a("avrsponse", bool);
        f49867G7 = x4.a("allow_pause_auto_refresh_immediately", bool);
        H7 = x4.a("ad_view_race_condition_fix_enabled", bool);
        I7 = x4.a("always_destroy_ad_view_on_ui_thread", bool);
        J7 = x4.a("fullscreen_display_delay_ms", 0L);
        K7 = x4.a(PtsLKY.CkmteVhp, bool);
        L7 = x4.a("ahdm", 500L);
        M7 = x4.a("ad_view_refresh_precache_request_viewability_undesired_flags", 246L);
        N7 = x4.a("ad_view_refresh_precache_request_enabled", bool2);
        O7 = x4.a("famttl_ms", 0L);
        P7 = x4.a("signal_expiration_ms", -1L);
        Q7 = x4.a("signal_cache_level", Integer.valueOf(b5.b.AD_FORMAT.ordinal()));
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        R7 = x4.a(znsSxz.JBpEPRlkPP, Long.valueOf(timeUnit2.toMillis(4L)));
        S7 = x4.a("native_ad_expiration_ms", Long.valueOf(timeUnit2.toMillis(4L)));
        T7 = x4.a("rena", bool2);
        U7 = x4.a("fullscreen_ad_displayed_timeout_ms", -1L);
        V7 = x4.a("freast_ms", -1L);
        W7 = x4.a("ad_hidden_timeout_ms", -1L);
        f49868X7 = x4.a("schedule_ad_hidden_on_ad_dismiss", bool);
        Y7 = x4.a("schedule_ad_hidden_on_single_task_app_relaunch", bool);
        f49869Z7 = x4.a(LHbnkhI.KieMXXb, Long.valueOf(timeUnit.toMillis(1L)));
        a8 = x4.a("proe", bool);
        b8 = x4.a("mute_state", 2);
        c8 = x4.a("saf", "");
        d8 = x4.a(QiDPjiOCZHDS.Xgjo, "");
        e8 = x4.a("malm_v2_e", bool);
        f8 = x4.a("slsaod", bool);
        f49870g8 = x4.a("mspc", 1);
        h8 = x4.a("mra", -1);
        i8 = x4.a("mra_af", "INTER,REWARDED,BANNER,LEADER,MREC");
        f49871j8 = x4.a("fadiafase", bool2);
        k8 = x4.a("fadwvcv", bool2);
        l8 = x4.a("bfarud", bool);
        m8 = x4.a("inacc", Boolean.valueOf(n7.b(Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
        n8 = x4.a("adiets_sec", Long.valueOf(TimeUnit.MINUTES.toSeconds(1L)));
        o8 = x4.a("faomq", bool);
        p8 = x4.a("rahcnct_sec", -1);
        q8 = x4.a("paslbaf", JsonUtils.EMPTY_JSON);
        r8 = x4.a("msbl", "{\"ad\":[\"ttdasi_ms\"]}");
        s8 = x4.a("siarni", bool);
        t8 = x4.a("spims", bool);
        u8 = x4.a("uabta", bool);
        f49874v8 = x4.a("use_initialization_spec_during_init", bool);
        w8 = x4.a("report_cimp_after_ierr", bool);
        x8 = x4.a("fail_collection_for_empty_signal", bool);
        f49875y8 = x4.a("fetch_mediated_ad_gzip", bool2);
        f49876z8 = x4.a("max_postback_gzip", bool2);
        A8 = x4.a("md_endpoint", "https://md.applovin.com/");
        B8 = x4.a("md_backup_endpoint", "https://md.applvn.com/");
        C8 = x4.a("md_v2", bool);
    }
}
