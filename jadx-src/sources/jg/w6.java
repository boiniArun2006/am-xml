package jg;

import jg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class w6 {
    public static final String n(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        if (nVar instanceof n.j) {
            return "admob_cmp_consent_failed";
        }
        if (nVar instanceof n.C0995n) {
            return "admob_cmp_consent_gathered";
        }
        if (nVar instanceof n.w6) {
            return "app_setup_completed";
        }
        if (nVar instanceof n.Ml) {
            return "app_setup_errored";
        }
        if (nVar instanceof n.I28) {
            return "app_setup_started";
        }
        if (nVar instanceof n.Wre) {
            return "cloud_download_cancelled";
        }
        if (nVar instanceof n.CN3) {
            return "cloud_download_completed";
        }
        if (nVar instanceof n.fuX) {
            return "cloud_download_flow_started";
        }
        if (nVar instanceof n.Dsr) {
            return "cloud_download_requested";
        }
        if (nVar instanceof n.aC) {
            return "cloud_project_deleted";
        }
        if (nVar instanceof n.C) {
            return "cloud_upload_cancelled";
        }
        if (nVar instanceof n.o) {
            return "cloud_upload_completed";
        }
        if (nVar instanceof n.qz) {
            return "cloud_upload_failed";
        }
        if (nVar instanceof n.Pl) {
            return "cloud_upload_flow_started";
        }
        if (nVar instanceof n.Xo) {
            return "cloud_upload_main_button_tapped";
        }
        if (nVar instanceof n.eO) {
            return "cloud_upload_requested";
        }
        if (nVar instanceof n.QJ) {
            return "crisper_link_opened";
        }
        if (nVar instanceof n.l3D) {
            return "export_completed";
        }
        if (nVar instanceof n.r) {
            return "export_saved";
        }
        if (nVar instanceof n.SPz) {
            return "export_shared";
        }
        if (nVar instanceof n.ci) {
            return "export_started";
        }
        if (nVar instanceof n.Q) {
            return "export_operation_started";
        }
        if (nVar instanceof n.C2198c) {
            return "export_operation_cancelled";
        }
        if (nVar instanceof n.UGc) {
            return "export_operation_failed";
        }
        if (nVar instanceof n.s4) {
            return "export_operation_completed";
        }
        if (nVar instanceof n.g9s) {
            return "export_ui_close_button_tapped";
        }
        if (nVar instanceof n.afx) {
            return "export_ui_scrolled";
        }
        if (nVar instanceof n.Z) {
            return "monetization_purchase_canceled";
        }
        if (nVar instanceof n.Ew) {
            return "monetization_purchase_completed";
        }
        if (nVar instanceof n.nKK) {
            return "monetization_purchase_pending";
        }
        if (nVar instanceof n.DAz) {
            return "onboarding_completed";
        }
        if (nVar instanceof n.u) {
            return "onboarding_skipped";
        }
        if (nVar instanceof n.qf) {
            return "onboarding_started";
        }
        if (nVar instanceof n.Ln) {
            return "paywall_alert_dismissed";
        }
        if (nVar instanceof n.lej) {
            return "paywall_alert_shown";
        }
        if (nVar instanceof n.iwV) {
            return "paywall_dismissed";
        }
        if (nVar instanceof n.M) {
            return "paywall_dismissed_with_ad";
        }
        if (nVar instanceof n.rv6) {
            return "paywall_shown";
        }
        if (nVar instanceof n.vd) {
            return "playful_unlock_ft_game_started";
        }
        if (nVar instanceof n.Lu) {
            return "playful_unlock_ft_ui_shown";
        }
        if (nVar instanceof n.Md) {
            return "project_closed";
        }
        if (nVar instanceof n.Zs) {
            return "project_created";
        }
        if (nVar instanceof n.P) {
            return "project_opened";
        }
        if (nVar instanceof n.C2199m) {
            return "sign_in_button_tapped";
        }
        if (nVar instanceof n.iF) {
            return "sign_in_canceled";
        }
        if (nVar instanceof n.mz) {
            return "sign_in_started";
        }
        if (nVar instanceof n.yg) {
            return "sign_in_completed";
        }
        if (nVar instanceof n.pO) {
            return "sign_in_failed";
        }
        if (nVar instanceof n.Sis) {
            return "sign_in_popup_dismissed";
        }
        if (nVar instanceof n.l4Z) {
            return "sign_in_popup_shown";
        }
        if (nVar instanceof n.psW) {
            return "popup_shown";
        }
        if (nVar instanceof n.h) {
            return "popup_button_tapped";
        }
        if (nVar instanceof n.K) {
            return "popup_dismissed";
        }
        if (nVar instanceof n.OU.j.C0989j) {
            return "templates_gallery_screen_all_templates_filter_tapped";
        }
        if (nVar instanceof n.OU.j.C0990n) {
            return "templates_gallery_screen_load_more_tapped";
        }
        if (nVar instanceof n.OU.j.w6) {
            return "templates_gallery_screen_refreshed";
        }
        if (nVar instanceof n.OU.j.Ml) {
            return "templates_gallery_screen_saved_templates_filter_tapped";
        }
        if (nVar instanceof n.OU.j.I28) {
            return "templates_gallery_screen_shown";
        }
        if (nVar instanceof n.OU.j.Wre) {
            return "templates_gallery_screen_template_circle_tapped";
        }
        if (nVar instanceof n.OU.j.CN3) {
            return "templates_gallery_screen_template_favorite_toggled";
        }
        if (nVar instanceof n.OU.j.fuX) {
            return "templates_gallery_screen_template_filter_tapped";
        }
        if (nVar instanceof n.OU.j.Dsr) {
            return "templates_gallery_screen_template_tapped";
        }
        if (nVar instanceof n.OU.j.aC) {
            return "templates_gallery_screen_view_your_templates_tapped";
        }
        if (nVar instanceof n.OU.AbstractC0991n.j) {
            return "home_screen_create_new_project_tapped";
        }
        if (nVar instanceof n.OU.AbstractC0991n.C0992n) {
            return "home_screen_get_started_with_project_tapped";
        }
        if (nVar instanceof n.OU.AbstractC0991n.w6) {
            return "home_screen_get_started_with_template_tapped";
        }
        if (nVar instanceof n.OU.AbstractC0991n.Ml) {
            return "home_screen_get_started_with_tutorial_tapped";
        }
        if (nVar instanceof n.OU.AbstractC0991n.I28) {
            return "home_screen_project_opened";
        }
        if (nVar instanceof n.OU.AbstractC0991n.Wre) {
            return "home_screen_refreshed";
        }
        if (nVar instanceof n.OU.AbstractC0991n.CN3) {
            return "home_screen_shown";
        }
        if (nVar instanceof n.OU.AbstractC0991n.fuX) {
            return "home_screen_template_circle_tapped";
        }
        if (nVar instanceof n.OU.AbstractC0991n.Dsr) {
            return "home_screen_view_all_projects_tapped";
        }
        if (nVar instanceof n.OU.AbstractC0991n.aC) {
            return "home_screen_view_all_templates_tapped";
        }
        if (nVar instanceof n.OU.w6.j) {
            return "templates_stories_screen_back_button_tapped";
        }
        if (nVar instanceof n.OU.w6.C0993n) {
            return "templates_stories_screen_dismissed_after_watching_last_video";
        }
        if (nVar instanceof n.OU.w6.C0994w6) {
            return "templates_stories_screen_next_button_tapped";
        }
        if (nVar instanceof n.OU.w6.Ml) {
            return "templates_stories_screen_previous_button_tapped";
        }
        if (nVar instanceof n.OU.w6.I28) {
            return "templates_stories_screen_see_all_saved_templates_tapped";
        }
        if (nVar instanceof n.OU.w6.Wre) {
            return "templates_stories_screen_shown";
        }
        if (nVar instanceof n.OU.w6.CN3) {
            return "templates_stories_screen_swiped_down_to_see_next";
        }
        if (nVar instanceof n.OU.w6.fuX) {
            return "templates_stories_screen_swiped_up_to_see_previous";
        }
        if (nVar instanceof n.OU.w6.Dsr) {
            return "templates_stories_screen_template_favorite_toggled";
        }
        if (nVar instanceof n.OU.w6.aC) {
            return "templates_stories_screen_use_template_tapped";
        }
        if (nVar instanceof n.OU.w6.C) {
            return "templates_stories_screen_video_did_play_to_end_time";
        }
        throw new NoWhenBranchMatchedException();
    }
}
