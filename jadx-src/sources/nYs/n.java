package nYs;

import com.alightcreative.monorepo.settings.AdMediator;
import com.alightcreative.monorepo.settings.AlightSettingsEntity;
import com.alightcreative.monorepo.settings.ExportFeature;
import com.alightcreative.monorepo.settings.ExportUIMenuItem;
import com.alightcreative.monorepo.settings.ExportedVideoAttachment;
import com.alightcreative.monorepo.settings.LandingTab;
import com.alightcreative.monorepo.settings.NavigationBarStyle;
import com.alightcreative.monorepo.settings.PlayfulUnlockStyle;
import com.alightcreative.monorepo.settings.StackedIntroOffersEntity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List f71181n;
    private static final List rl;

    static {
        ExportUIMenuItem exportUIMenuItem = ExportUIMenuItem.VIDEO;
        ExportUIMenuItem exportUIMenuItem2 = ExportUIMenuItem.CLOUD_BACKUP;
        ExportUIMenuItem exportUIMenuItem3 = ExportUIMenuItem.PROJECT_PACKAGE;
        ExportUIMenuItem exportUIMenuItem4 = ExportUIMenuItem.PNG;
        ExportUIMenuItem exportUIMenuItem5 = ExportUIMenuItem.IMAGE_SEQUENCE;
        ExportUIMenuItem exportUIMenuItem6 = ExportUIMenuItem.GIF;
        ExportUIMenuItem exportUIMenuItem7 = ExportUIMenuItem.XML;
        f71181n = CollectionsKt.listOf((Object[]) new ExportUIMenuItem[]{exportUIMenuItem, exportUIMenuItem2, exportUIMenuItem3, exportUIMenuItem4, exportUIMenuItem5, exportUIMenuItem6, exportUIMenuItem7});
        rl = CollectionsKt.listOf((Object[]) new ExportUIMenuItem[]{exportUIMenuItem3, exportUIMenuItem7});
    }

    private static final LandingTab KN(String str) {
        return Intrinsics.areEqual(str, "landing_tab_projects") ? LandingTab.PROJECTS : LandingTab.HOME;
    }

    private static final ExportFeature O(String str) {
        return Intrinsics.areEqual(str, c.f62175h) ? ExportFeature.TEMPLATE : ExportFeature.UNDEFINED;
    }

    private static final ExportedVideoAttachment Uo(String str) {
        return Intrinsics.areEqual(str, "qr_code_intro") ? ExportedVideoAttachment.QR_CODE_INTRO : Intrinsics.areEqual(str, "qr_code_outro") ? ExportedVideoAttachment.QR_CODE_OUTRO : ExportedVideoAttachment.NONE;
    }

    public static final List n() {
        return f71181n;
    }

    public static final j nr(AlightSettingsEntity alightSettingsEntity) {
        LandingTab landingTabKN;
        NavigationBarStyle navigationBarStyleXMQ;
        List arrayList;
        List arrayList2;
        List listEmptyList;
        ExportedVideoAttachment exportedVideoAttachmentUo;
        PlayfulUnlockStyle playfulUnlockStyleMUb;
        Intrinsics.checkNotNullParameter(alightSettingsEntity, "<this>");
        String crisperScript = alightSettingsEntity.getCrisperScript();
        Boolean onboardingShowCards = alightSettingsEntity.getOnboardingShowCards();
        boolean zBooleanValue = onboardingShowCards != null ? onboardingShowCards.booleanValue() : false;
        Boolean onboardingShowSkipButton = alightSettingsEntity.getOnboardingShowSkipButton();
        boolean zBooleanValue2 = onboardingShowSkipButton != null ? onboardingShowSkipButton.booleanValue() : false;
        Boolean boolIsTryItFirstAvailable = alightSettingsEntity.isTryItFirstAvailable();
        boolean zBooleanValue3 = boolIsTryItFirstAvailable != null ? boolIsTryItFirstAvailable.booleanValue() : false;
        String adsExperience = alightSettingsEntity.getAdsExperience();
        if (adsExperience == null) {
            adsExperience = "control";
        }
        String landingTab = alightSettingsEntity.getLandingTab();
        if (landingTab == null || (landingTabKN = KN(landingTab)) == null) {
            landingTabKN = LandingTab.HOME;
        }
        String navigationBar = alightSettingsEntity.getNavigationBar();
        if (navigationBar == null || (navigationBarStyleXMQ = xMQ(navigationBar)) == null) {
            navigationBarStyleXMQ = NavigationBarStyle.RESKIN;
        }
        List<String> exportMenuItems = alightSettingsEntity.getExportMenuItems();
        if (exportMenuItems != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(exportMenuItems, 10));
            Iterator<T> it = exportMenuItems.iterator();
            while (it.hasNext()) {
                arrayList.add(J2((String) it.next()));
            }
        } else {
            arrayList = f71181n;
        }
        List list = arrayList;
        List<String> exportMenuItemsMultishare = alightSettingsEntity.getExportMenuItemsMultishare();
        if (exportMenuItemsMultishare != null) {
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(exportMenuItemsMultishare, 10));
            Iterator<T> it2 = exportMenuItemsMultishare.iterator();
            while (it2.hasNext()) {
                arrayList2.add(J2((String) it2.next()));
            }
        } else {
            arrayList2 = rl;
        }
        List<String> featuresWithNewBadge = alightSettingsEntity.getFeaturesWithNewBadge();
        if (featuresWithNewBadge != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(featuresWithNewBadge, 10));
            Iterator<T> it3 = featuresWithNewBadge.iterator();
            while (it3.hasNext()) {
                listEmptyList.add(O((String) it3.next()));
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList;
        Boolean signInDisabledPPImport = alightSettingsEntity.getSignInDisabledPPImport();
        boolean zBooleanValue4 = signInDisabledPPImport != null ? signInDisabledPPImport.booleanValue() : false;
        Boolean shareEligibilityWatchAdsEnabled = alightSettingsEntity.getShareEligibilityWatchAdsEnabled();
        boolean zBooleanValue5 = shareEligibilityWatchAdsEnabled != null ? shareEligibilityWatchAdsEnabled.booleanValue() : false;
        Integer shareEligibilityWatchAdsCap = alightSettingsEntity.getShareEligibilityWatchAdsCap();
        int iIntValue = shareEligibilityWatchAdsCap != null ? shareEligibilityWatchAdsCap.intValue() : 0;
        Boolean templateExportToggleEnabled = alightSettingsEntity.getTemplateExportToggleEnabled();
        boolean zBooleanValue6 = templateExportToggleEnabled != null ? templateExportToggleEnabled.booleanValue() : true;
        String exportedVideoAttachment = alightSettingsEntity.getExportedVideoAttachment();
        if (exportedVideoAttachment == null || (exportedVideoAttachmentUo = Uo(exportedVideoAttachment)) == null) {
            exportedVideoAttachmentUo = ExportedVideoAttachment.NONE;
        }
        Integer defaultResolutionProjectCreation = alightSettingsEntity.getDefaultResolutionProjectCreation();
        Integer numValueOf = Integer.valueOf(defaultResolutionProjectCreation != null ? defaultResolutionProjectCreation.intValue() : 1080);
        Boolean templateRevampedImportFlowEnabled = alightSettingsEntity.getTemplateRevampedImportFlowEnabled();
        Boolean boolValueOf = Boolean.valueOf(templateRevampedImportFlowEnabled != null ? templateRevampedImportFlowEnabled.booleanValue() : false);
        Boolean xmlImportEnabled = alightSettingsEntity.getXmlImportEnabled();
        boolean zBooleanValue7 = xmlImportEnabled != null ? xmlImportEnabled.booleanValue() : false;
        Boolean newWatermarkDesign = alightSettingsEntity.getNewWatermarkDesign();
        boolean zBooleanValue8 = newWatermarkDesign != null ? newWatermarkDesign.booleanValue() : false;
        Boolean watermarkV2Enabled = alightSettingsEntity.getWatermarkV2Enabled();
        boolean zBooleanValue9 = watermarkV2Enabled != null ? watermarkV2Enabled.booleanValue() : false;
        Boolean presetSavePreviewApplyExportEnabled = alightSettingsEntity.getPresetSavePreviewApplyExportEnabled();
        boolean zBooleanValue10 = presetSavePreviewApplyExportEnabled != null ? presetSavePreviewApplyExportEnabled.booleanValue() : false;
        Boolean creatorProgramEnabled = alightSettingsEntity.getCreatorProgramEnabled();
        boolean zBooleanValue11 = creatorProgramEnabled != null ? creatorProgramEnabled.booleanValue() : false;
        Boolean creatorProgramStandby = alightSettingsEntity.getCreatorProgramStandby();
        boolean zBooleanValue12 = creatorProgramStandby != null ? creatorProgramStandby.booleanValue() : false;
        List<String> creatorProgramRewardList = alightSettingsEntity.getCreatorProgramRewardList();
        if (creatorProgramRewardList == null) {
            creatorProgramRewardList = CollectionsKt.emptyList();
        }
        Boolean mdtContentLibraryEnabled = alightSettingsEntity.getMdtContentLibraryEnabled();
        boolean zBooleanValue13 = mdtContentLibraryEnabled != null ? mdtContentLibraryEnabled.booleanValue() : false;
        Boolean mdtContentLibraryRandomized = alightSettingsEntity.getMdtContentLibraryRandomized();
        boolean zBooleanValue14 = mdtContentLibraryRandomized != null ? mdtContentLibraryRandomized.booleanValue() : false;
        Boolean creatorRankingEnabled = alightSettingsEntity.getCreatorRankingEnabled();
        boolean zBooleanValue15 = creatorRankingEnabled != null ? creatorRankingEnabled.booleanValue() : false;
        Boolean creatorRankingStandby = alightSettingsEntity.getCreatorRankingStandby();
        boolean zBooleanValue16 = creatorRankingStandby != null ? creatorRankingStandby.booleanValue() : false;
        List<String> technicalEvents = alightSettingsEntity.getTechnicalEvents();
        if (technicalEvents == null) {
            technicalEvents = CollectionsKt.emptyList();
        }
        List<String> profilingEvents = alightSettingsEntity.getProfilingEvents();
        if (profilingEvents == null) {
            profilingEvents = CollectionsKt.emptyList();
        }
        Boolean upsellPaywallShowPriceDifferences = alightSettingsEntity.getUpsellPaywallShowPriceDifferences();
        boolean zBooleanValue17 = upsellPaywallShowPriceDifferences != null ? upsellPaywallShowPriceDifferences.booleanValue() : false;
        Boolean analyticsLogsEnabled = alightSettingsEntity.getAnalyticsLogsEnabled();
        boolean zBooleanValue18 = analyticsLogsEnabled != null ? analyticsLogsEnabled.booleanValue() : false;
        Boolean paywallCardsUsePremiumLiteNames = alightSettingsEntity.getPaywallCardsUsePremiumLiteNames();
        boolean zBooleanValue19 = paywallCardsUsePremiumLiteNames != null ? paywallCardsUsePremiumLiteNames.booleanValue() : false;
        String playfulUnlockDesign = alightSettingsEntity.getPlayfulUnlockDesign();
        if (playfulUnlockDesign == null || (playfulUnlockStyleMUb = mUb(playfulUnlockDesign)) == null) {
            playfulUnlockStyleMUb = PlayfulUnlockStyle.CALM;
        }
        Boolean playfulUnlockCanDismissEarly = alightSettingsEntity.getPlayfulUnlockCanDismissEarly();
        boolean zBooleanValue20 = playfulUnlockCanDismissEarly != null ? playfulUnlockCanDismissEarly.booleanValue() : false;
        Boolean paywallCardsPriceInCards = alightSettingsEntity.getPaywallCardsPriceInCards();
        boolean zBooleanValue21 = paywallCardsPriceInCards != null ? paywallCardsPriceInCards.booleanValue() : false;
        Boolean shouldHideHomepageUntilFirstHook = alightSettingsEntity.getShouldHideHomepageUntilFirstHook();
        boolean zBooleanValue22 = shouldHideHomepageUntilFirstHook != null ? shouldHideHomepageUntilFirstHook.booleanValue() : false;
        Boolean specialEventLicensesEnabled = alightSettingsEntity.getSpecialEventLicensesEnabled();
        boolean zBooleanValue23 = specialEventLicensesEnabled != null ? specialEventLicensesEnabled.booleanValue() : false;
        Boolean admobCmpEnabled = alightSettingsEntity.getAdmobCmpEnabled();
        boolean zBooleanValue24 = admobCmpEnabled != null ? admobCmpEnabled.booleanValue() : false;
        StackedIntroOffersEntity stackedIntroOffers = alightSettingsEntity.getStackedIntroOffers();
        AdMediator adMediatorT = t(alightSettingsEntity.getAdMediationProvider());
        String admobInterstitialAdUnitId = alightSettingsEntity.getAdmobInterstitialAdUnitId();
        String admobRewardedAdUnitId = alightSettingsEntity.getAdmobRewardedAdUnitId();
        String maxInterstitialAdUnitId = alightSettingsEntity.getMaxInterstitialAdUnitId();
        String maxRewardedAdUnitId = alightSettingsEntity.getMaxRewardedAdUnitId();
        Boolean boolIsInjetEnabled = alightSettingsEntity.isInjetEnabled();
        boolean zBooleanValue25 = boolIsInjetEnabled != null ? boolIsInjetEnabled.booleanValue() : false;
        String injetVersioningFileUrl = alightSettingsEntity.getInjetVersioningFileUrl();
        Boolean boolIsNewTemplatesExperienceEnabled = alightSettingsEntity.isNewTemplatesExperienceEnabled();
        boolean zBooleanValue26 = boolIsNewTemplatesExperienceEnabled != null ? boolIsNewTemplatesExperienceEnabled.booleanValue() : false;
        Boolean koreanOnboardingFlowEnabled = alightSettingsEntity.getKoreanOnboardingFlowEnabled();
        return new j(crisperScript, zBooleanValue, zBooleanValue2, zBooleanValue3, adsExperience, landingTabKN, navigationBarStyleXMQ, list, arrayList2, list2, zBooleanValue4, zBooleanValue5, iIntValue, zBooleanValue6, exportedVideoAttachmentUo, numValueOf, boolValueOf, zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, creatorProgramRewardList, zBooleanValue13, zBooleanValue14, zBooleanValue15, zBooleanValue16, technicalEvents, profilingEvents, zBooleanValue17, zBooleanValue18, zBooleanValue19, playfulUnlockStyleMUb, zBooleanValue20, zBooleanValue21, zBooleanValue22, zBooleanValue23, zBooleanValue24, stackedIntroOffers, adMediatorT, admobInterstitialAdUnitId, admobRewardedAdUnitId, maxInterstitialAdUnitId, maxRewardedAdUnitId, zBooleanValue25, injetVersioningFileUrl, zBooleanValue26, koreanOnboardingFlowEnabled != null ? koreanOnboardingFlowEnabled.booleanValue() : false);
    }

    public static final List rl() {
        return rl;
    }

    private static final AdMediator t(String str) {
        return Intrinsics.areEqual(str, "admob") ? AdMediator.ADMOB : Intrinsics.areEqual(str, "max") ? AdMediator.MAX : AdMediator.MAX;
    }

    private static final NavigationBarStyle xMQ(String str) {
        return NavigationBarStyle.RESKIN;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final ExportUIMenuItem J2(String str) {
        switch (str.hashCode()) {
            case -1321546630:
                if (str.equals(c.f62175h)) {
                    return ExportUIMenuItem.TEMPLATE;
                }
                break;
            case -1159440859:
                if (str.equals("image_sequence")) {
                    return ExportUIMenuItem.IMAGE_SEQUENCE;
                }
                break;
            case -980098337:
                if (str.equals("preset")) {
                    return ExportUIMenuItem.PRESET;
                }
                break;
            case 102340:
                if (str.equals("gif")) {
                    return ExportUIMenuItem.GIF;
                }
                break;
            case 111145:
                if (str.equals("png")) {
                    return ExportUIMenuItem.PNG;
                }
                break;
            case 118807:
                if (str.equals("xml")) {
                    return ExportUIMenuItem.XML;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    return ExportUIMenuItem.VIDEO;
                }
                break;
            case 1094253856:
                if (str.equals("project_package")) {
                    return ExportUIMenuItem.PROJECT_PACKAGE;
                }
                break;
            case 2092349259:
                if (str.equals("cloud_upload")) {
                    return ExportUIMenuItem.CLOUD_BACKUP;
                }
                break;
        }
        return ExportUIMenuItem.UNDEFINED;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final PlayfulUnlockStyle mUb(String str) {
        switch (str.hashCode()) {
            case -1694805806:
                if (str.equals("cards_vertical")) {
                    return PlayfulUnlockStyle.CARDS_VERTICAL;
                }
                break;
            case -171372473:
                if (str.equals("calm_old")) {
                    return PlayfulUnlockStyle.CALM_OLD;
                }
                break;
            case 3045983:
                if (str.equals("calm")) {
                    return PlayfulUnlockStyle.CALM;
                }
                break;
            case 266309248:
                if (str.equals("cards_horizontal")) {
                    return PlayfulUnlockStyle.CARDS_HORIZONTAL;
                }
                break;
        }
        return PlayfulUnlockStyle.CALM;
    }
}
