package com.alightcreative.app.motion.persist;

import HI0.qf;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import z8.AbstractC2487Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class j {
    public static final int $stable;
    private static final long LICENSE_CACHE_VERSION;
    private static final com.alightcreative.app.motion.persist.Ml acDevMode$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 accountCreated$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 accountInfoCacheDate$delegate;
    private static final com.alightcreative.app.motion.persist.Ml acctTestMode$delegate;
    private static final com.alightcreative.app.motion.persist.I28 adsWatchedForProject$delegate;
    private static final com.alightcreative.app.motion.persist.Ml agreedPrivacy$delegate;
    private static final com.alightcreative.app.motion.persist.Ml agreedPrivacyPolicyVersion$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 apkInvalid$delegate;
    private static final com.alightcreative.app.motion.persist.Ml appDay$delegate;
    private static final com.alightcreative.app.motion.persist.Ml appInstance$delegate;
    private static final com.alightcreative.app.motion.persist.Ml audioBrowserMode$delegate;
    private static final com.alightcreative.app.motion.persist.Ml audioResamplerType$delegate;
    private static final com.alightcreative.app.motion.persist.I28 cloudSyncTimeMillis$delegate;
    private static final com.alightcreative.app.motion.persist.I28 cloudToLocalIdMap$delegate;
    private static final com.alightcreative.app.motion.persist.Ml colorSelector$delegate;
    private static final com.alightcreative.app.motion.persist.Ml colorTab$delegate;
    private static final com.alightcreative.app.motion.persist.Ml controlpadAccel$delegate;
    private static final com.alightcreative.app.motion.persist.Ml countdownDiscountPercent$delegate;
    private static final com.alightcreative.app.motion.persist.Ml countdownPaywallStartTime$delegate;
    private static final com.alightcreative.app.motion.persist.Ml defaultLayerDuration$delegate;
    private static final com.alightcreative.app.motion.persist.Ml demoMode$delegate;
    private static final com.alightcreative.app.motion.persist.Ml demoModeMediaAndBuckets$delegate;
    private static final com.alightcreative.app.motion.persist.Ml deviceCapsAvailableInDb$delegate;
    private static final com.alightcreative.app.motion.persist.Ml deviceCapsCheckAttempts$delegate;
    private static final com.alightcreative.app.motion.persist.Ml deviceCapsCheckBypassed$delegate;
    private static final com.alightcreative.app.motion.persist.Ml deviceCapsCheckProd$delegate;
    private static final com.alightcreative.app.motion.persist.Ml deviceCapsCheckSource$delegate;
    private static final com.alightcreative.app.motion.persist.Ml deviceCapsCheckSuccess$delegate;
    private static final com.alightcreative.app.motion.persist.Ml deviceCapsCheckVer$delegate;
    private static final com.alightcreative.app.motion.persist.Ml deviceID$delegate;
    private static final com.alightcreative.app.motion.persist.Ml disableRenderPerformanceTrace$delegate;
    private static final com.alightcreative.app.motion.persist.Ml drawingColor$delegate;
    private static final com.alightcreative.app.motion.persist.Ml drawingPreview$delegate;
    private static final com.alightcreative.app.motion.persist.Ml drawingStrokeWidth$delegate;
    private static final com.alightcreative.app.motion.persist.Ml drawingTool$delegate;
    private static final com.alightcreative.app.motion.persist.Ml easingOvershoot$delegate;
    private static final com.alightcreative.app.motion.persist.Ml effectRecentFavSelectedPos$delegate;
    private static final com.alightcreative.app.motion.persist.Ml elementTabVisitTimestamp$delegate;
    private static final com.alightcreative.app.motion.persist.Ml emulatingGLSLMinMaxClamp$delegate;
    private static final com.alightcreative.app.motion.persist.Ml experimentalEffects$delegate;
    private static final com.alightcreative.app.motion.persist.Ml experimentalFeatures$delegate;
    private static final com.alightcreative.app.motion.persist.Ml exportedProjectIds$delegate;
    private static final com.alightcreative.app.motion.persist.Ml favoriteEffects$delegate;
    private static final com.alightcreative.app.motion.persist.Ml favoriteFonts$delegate;
    private static final com.alightcreative.app.motion.persist.Ml feedIgnorePubDate$delegate;
    private static final com.alightcreative.app.motion.persist.Ml firebaseEmulatorAddress$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 firstAppExec$delegate;
    private static final com.alightcreative.app.motion.persist.Ml fontFilterDisplay$delegate;
    private static final com.alightcreative.app.motion.persist.Ml fontFilterFavorite$delegate;
    private static final com.alightcreative.app.motion.persist.Ml fontFilterHandwriting$delegate;
    private static final com.alightcreative.app.motion.persist.Ml fontFilterImported$delegate;
    private static final com.alightcreative.app.motion.persist.Ml fontFilterMonospace$delegate;
    private static final com.alightcreative.app.motion.persist.Ml fontFilterSansSerif$delegate;
    private static final com.alightcreative.app.motion.persist.Ml fontFilterSerif$delegate;
    private static final com.alightcreative.app.motion.persist.Ml fontLanguageFilter$delegate;
    private static final com.alightcreative.app.motion.persist.Ml fontSorting$delegate;
    private static final com.alightcreative.app.motion.persist.Ml forceFreeTrialEligibility$delegate;
    private static final com.alightcreative.app.motion.persist.Ml gifExportInfo$delegate;
    private static final com.alightcreative.app.motion.persist.Ml grayTheme$delegate;
    private static final com.alightcreative.app.motion.persist.Ml iapPopupCheckInfo$delegate;
    private static final com.alightcreative.app.motion.persist.Ml iapPrompt$delegate;
    private static final com.alightcreative.app.motion.persist.Ml iapPromptContentTest$delegate;
    private static final com.alightcreative.app.motion.persist.Ml iapPromptDelay$delegate;
    private static final com.alightcreative.app.motion.persist.Ml iapSimulateBadToken$delegate;
    private static final com.alightcreative.app.motion.persist.Ml iaptest$delegate;
    private static final com.alightcreative.app.motion.persist.Ml imgSeExportInfo$delegate;
    private static final com.alightcreative.app.motion.persist.Ml importedProjectIds$delegate;
    private static final com.alightcreative.app.motion.persist.Ml importedXmlIds$delegate;
    private static final com.alightcreative.app.motion.persist.Ml installDateTimestamp$delegate;
    private static final com.alightcreative.app.motion.persist.Ml installedAppVersions$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 lastApkValidation$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 lastApkValidationAttempt$delegate;
    private static final com.alightcreative.app.motion.persist.Ml lastAppExecution$delegate;
    private static final com.alightcreative.app.motion.persist.Ml lastFeedHash$delegate;
    private static final com.alightcreative.app.motion.persist.Ml lastSeenElementCount$delegate;
    private static final com.alightcreative.app.motion.persist.Ml lastSeenProjectCount$delegate;
    private static final com.alightcreative.app.motion.persist.Ml lastSerializedFeed$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 latestServerTimeMillis$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 licenseCacheVersion$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 licenseInfo$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 licenseUid$delegate;
    private static final com.alightcreative.app.motion.persist.Ml liveShapeLockAspect$delegate;
    private static final com.alightcreative.app.motion.persist.Ml liveShapeSizeFromCenter$delegate;
    private static final com.alightcreative.app.motion.persist.Ml loopingPlay$delegate;
    private static final com.alightcreative.app.motion.persist.Ml lowQualityPreview$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 mandatoryUpdateVer$delegate;
    private static final com.alightcreative.app.motion.persist.Ml maxLayers1080$delegate;
    private static final com.alightcreative.app.motion.persist.Ml maxLayers1440$delegate;
    private static final com.alightcreative.app.motion.persist.Ml maxLayers2160$delegate;
    private static final com.alightcreative.app.motion.persist.Ml maxLayers720$delegate;
    private static final com.alightcreative.app.motion.persist.Ml maxRes$delegate;
    private static final com.alightcreative.app.motion.persist.Ml maxResWithVideo$delegate;
    private static final com.alightcreative.app.motion.persist.Ml mediaAccessRequestNumber$delegate;
    private static final com.alightcreative.app.motion.persist.Ml mediaBrowserMode$delegate;
    private static final com.alightcreative.app.motion.persist.Ml mediaBucketID$delegate;
    private static final com.alightcreative.app.motion.persist.Ml mediaBucketName$delegate;
    private static final com.alightcreative.app.motion.persist.Ml miniColorPickerExpandAlpha$delegate;
    private static final com.alightcreative.app.motion.persist.Ml miniMediaBrowserAudioMode$delegate;
    private static final com.alightcreative.app.motion.persist.Ml newProjectAspect$delegate;
    private static final com.alightcreative.app.motion.persist.Ml newProjectBg$delegate;
    private static final com.alightcreative.app.motion.persist.Ml newProjectCustomHeight$delegate;
    private static final com.alightcreative.app.motion.persist.Ml newProjectCustomSizeLink$delegate;
    private static final com.alightcreative.app.motion.persist.Ml newProjectCustomWidth$delegate;
    private static final com.alightcreative.app.motion.persist.Ml newProjectFps$delegate;
    private static final com.alightcreative.app.motion.persist.Ml newProjectRes$delegate;
    private static final com.alightcreative.app.motion.persist.Ml onboardingCompletedOrSkipped$delegate;
    private static final com.alightcreative.app.motion.persist.Ml oomCount$delegate;
    private static final com.alightcreative.app.motion.persist.Ml paywallNumber$delegate;
    private static final com.alightcreative.app.motion.persist.Ml profilingHud$delegate;
    private static final com.alightcreative.app.motion.persist.I28 projectEditTime$delegate;
    private static final com.alightcreative.app.motion.persist.Ml projectPackageFreeUserMaxDownloadSize$delegate;
    private static final com.alightcreative.app.motion.persist.Ml projectPresetFps$delegate;
    private static final com.alightcreative.app.motion.persist.Ml projectPresetRes$delegate;
    private static final com.alightcreative.app.motion.persist.Ml projectSortOrder$delegate;
    private static final com.alightcreative.app.motion.persist.Ml projectsCreated$delegate;
    private static final com.alightcreative.app.motion.persist.Ml projectsExported$delegate;
    private static final com.alightcreative.app.motion.persist.Ml projectsShared$delegate;
    private static final com.alightcreative.app.motion.persist.Ml recentMediaSize$delegate;
    private static final com.alightcreative.app.motion.persist.Ml recentlyUsedAudios$delegate;
    private static final com.alightcreative.app.motion.persist.Ml recentlyUsedEffectTags$delegate;
    private static final com.alightcreative.app.motion.persist.Ml recentlyUsedEffects$delegate;
    private static final com.alightcreative.app.motion.persist.Ml recentlyUsedFonts$delegate;
    private static final com.alightcreative.app.motion.persist.Ml recentlyUsedMedia$delegate;
    private static final com.alightcreative.app.motion.persist.Ml reviewPopupResponse$delegate;
    private static final com.alightcreative.app.motion.persist.Ml sceneBrowserMode$delegate;
    private static final com.alightcreative.app.motion.persist.I28 seenElementDownloads$delegate;
    private static final com.alightcreative.app.motion.persist.Ml sendDeviceIDWithCrashes$delegate;
    private static final com.alightcreative.app.motion.persist.Ml sessionNumber$delegate;
    private static final com.alightcreative.app.motion.persist.Ml showBookmarkTooltip$delegate;
    private static final com.alightcreative.app.motion.persist.Ml showMBTooltip$delegate;
    private static final com.alightcreative.app.motion.persist.Ml showNewFeaturePopup$delegate;
    private static final com.alightcreative.app.motion.persist.Ml showNewTagForAddTemplateElement$delegate;
    private static final com.alightcreative.app.motion.persist.Ml showNewTagForPresetEditButton$delegate;
    private static final com.alightcreative.app.motion.persist.Ml showNewTagForPresetsSubTab$delegate;
    private static final com.alightcreative.app.motion.persist.Ml showNewTagForTemplates$delegate;
    private static final com.alightcreative.app.motion.persist.Ml showed36EffectBrowserPopup$delegate;
    private static final com.alightcreative.app.motion.persist.Ml showedLagNotice$delegate;
    private static final com.alightcreative.app.motion.persist.Ml showedLagNoticeDate$delegate;
    private static final com.alightcreative.app.motion.persist.Ml simulateUpload$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 skuList$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 skuListBuildVersionCode$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 skuListFetched$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 skuListNeedsRefresh$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 skuListUid$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 skulist$delegate;
    private static final com.alightcreative.app.motion.persist.Ml specialEventPopupShown$delegate;
    private static final com.alightcreative.app.motion.persist.Ml stagingFeed$delegate;
    private static final com.alightcreative.app.motion.persist.Ml testEEA$delegate;
    private static final com.alightcreative.app.motion.persist.Ml thumbBounds$delegate;
    private static final com.alightcreative.app.motion.persist.Ml timeOffsetSeconds$delegate;
    private static final com.alightcreative.app.motion.persist.I28 trackProjectEditTime$delegate;
    private static final com.alightcreative.app.motion.persist.Ml turnedOnCameraView$delegate;
    private static final com.alightcreative.app.motion.persist.I28 unfinishedCloudUploadTimestamps$delegate;
    private static final com.alightcreative.app.motion.persist.Ml unlockedFeatures$delegate;
    private static final com.alightcreative.app.motion.persist.CN3 updateSp$delegate;
    private static final com.alightcreative.app.motion.persist.Ml useFirebaseEmulator$delegate;
    private static final com.alightcreative.app.motion.persist.Ml useInterstitialVideoTestAds$delegate;
    private static final com.alightcreative.app.motion.persist.Ml useTestAds$delegate;
    private static final com.alightcreative.app.motion.persist.Ml usedNewFeatures$delegate;
    private static final com.alightcreative.app.motion.persist.Ml userDemoMode$delegate;
    private static final com.alightcreative.app.motion.persist.I28 verifiedPurchaseExpirationTime$delegate;
    private static final com.alightcreative.app.motion.persist.I28 verifiedPurchaseUid$delegate;
    private static final com.alightcreative.app.motion.persist.Ml videoExportInfo$delegate;
    private static final com.alightcreative.app.motion.persist.Ml vsalt$delegate;
    private static final com.alightcreative.app.motion.persist.Ml watermark$delegate;
    private static final com.alightcreative.app.motion.persist.Ml wmPosition$delegate;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "emulatingGLSLMinMaxClamp", "getEmulatingGLSLMinMaxClamp()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "colorSelector", "getColorSelector()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "drawingTool", "getDrawingTool()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "drawingColor", HrvQKfmFZJudBc.eSoPZM, 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "drawingStrokeWidth", "getDrawingStrokeWidth()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "controlpadAccel", "getControlpadAccel()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "grayTheme", "getGrayTheme()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "mediaBrowserMode", "getMediaBrowserMode()Lcom/alightcreative/app/motion/persist/Persist$MediaBrowserMode;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "audioBrowserMode", "getAudioBrowserMode()Lcom/alightcreative/app/motion/persist/Persist$AudioBrowserMode;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "sceneBrowserMode", "getSceneBrowserMode()Lcom/alightcreative/app/motion/persist/Persist$SceneBrowserMode;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "projectPresetRes", "getProjectPresetRes()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "projectPresetFps", "getProjectPresetFps()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "newProjectAspect", "getNewProjectAspect()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "newProjectRes", "getNewProjectRes()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "newProjectCustomHeight", "getNewProjectCustomHeight()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "newProjectCustomWidth", "getNewProjectCustomWidth()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "newProjectFps", "getNewProjectFps()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "newProjectBg", "getNewProjectBg()Lcom/alightcreative/app/motion/persist/Persist$Background;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "newProjectCustomSizeLink", "getNewProjectCustomSizeLink()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "miniMediaBrowserAudioMode", "getMiniMediaBrowserAudioMode()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "watermark", "getWatermark()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "projectsCreated", "getProjectsCreated()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "projectsExported", "getProjectsExported()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "projectsShared", "getProjectsShared()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "projectSortOrder", "getProjectSortOrder()Lcom/alightcreative/app/motion/persist/Persist$SortOrder;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "loopingPlay", "getLoopingPlay()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "agreedPrivacy", "getAgreedPrivacy()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "agreedPrivacyPolicyVersion", "getAgreedPrivacyPolicyVersion()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "onboardingCompletedOrSkipped", "getOnboardingCompletedOrSkipped()Z", 0)), Reflection.property1(new PropertyReference1Impl(j.class, "thumbBounds", "getThumbBounds()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "sendDeviceIDWithCrashes", "getSendDeviceIDWithCrashes()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "deviceID", "getDeviceID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "vsalt", "getVsalt()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "iaptest", "getIaptest()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "demoMode", "getDemoMode()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "userDemoMode", "getUserDemoMode()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "acctTestMode", "getAcctTestMode()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "defaultLayerDuration", "getDefaultLayerDuration()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "skulist", "getSkulist()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "skuList", "getSkuList()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "skuListFetched", "getSkuListFetched()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "skuListNeedsRefresh", "getSkuListNeedsRefresh()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "skuListUid", "getSkuListUid()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "skuListBuildVersionCode", "getSkuListBuildVersionCode()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "accountInfoCacheDate", "getAccountInfoCacheDate()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "licenseCacheVersion", "getLicenseCacheVersion()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "licenseInfo", "getLicenseInfo()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "licenseUid", "getLicenseUid()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "accountCreated", "getAccountCreated()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "latestServerTimeMillis", "getLatestServerTimeMillis()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "deviceCapsCheckProd", "getDeviceCapsCheckProd()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "deviceCapsCheckVer", "getDeviceCapsCheckVer()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "maxLayers720", "getMaxLayers720()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "maxLayers1080", "getMaxLayers1080()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "maxLayers1440", "getMaxLayers1440()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "maxLayers2160", "getMaxLayers2160()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "maxRes", "getMaxRes()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "maxResWithVideo", "getMaxResWithVideo()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "deviceCapsCheckAttempts", "getDeviceCapsCheckAttempts()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "deviceCapsCheckBypassed", "getDeviceCapsCheckBypassed()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "deviceCapsCheckSuccess", "getDeviceCapsCheckSuccess()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "deviceCapsCheckSource", "getDeviceCapsCheckSource()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "deviceCapsAvailableInDb", "getDeviceCapsAvailableInDb()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "stagingFeed", "getStagingFeed()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "iapSimulateBadToken", "getIapSimulateBadToken()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "lastApkValidation", "getLastApkValidation()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "lastApkValidationAttempt", "getLastApkValidationAttempt()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "firstAppExec", "getFirstAppExec()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "apkInvalid", "getApkInvalid()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "updateSp", "getUpdateSp()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "mandatoryUpdateVer", "getMandatoryUpdateVer()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "useTestAds", "getUseTestAds()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "useInterstitialVideoTestAds", "getUseInterstitialVideoTestAds()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "colorTab", "getColorTab()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "recentlyUsedAudios", "getRecentlyUsedAudios()Lcom/alightcreative/app/motion/persist/RecentStrings;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "recentlyUsedMedia", "getRecentlyUsedMedia()Lcom/alightcreative/app/motion/persist/RecentStrings;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "recentMediaSize", "getRecentMediaSize()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "acDevMode", "getAcDevMode()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "feedIgnorePubDate", "getFeedIgnorePubDate()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "profilingHud", "getProfilingHud()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "disableRenderPerformanceTrace", "getDisableRenderPerformanceTrace()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "recentlyUsedEffects", "getRecentlyUsedEffects()Lcom/alightcreative/app/motion/persist/RecentStrings;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "recentlyUsedEffectTags", "getRecentlyUsedEffectTags()Lcom/alightcreative/app/motion/persist/RecentStrings;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "favoriteEffects", "getFavoriteEffects()Ljava/util/Set;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "importedProjectIds", "getImportedProjectIds()Ljava/util/Set;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "importedXmlIds", "getImportedXmlIds()Ljava/util/Set;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "installedAppVersions", "getInstalledAppVersions()Ljava/util/Set;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "lowQualityPreview", "getLowQualityPreview()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "fontFilterSerif", "getFontFilterSerif()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "fontFilterSansSerif", "getFontFilterSansSerif()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "fontFilterDisplay", "getFontFilterDisplay()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "fontFilterHandwriting", "getFontFilterHandwriting()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "fontFilterMonospace", "getFontFilterMonospace()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "fontFilterImported", "getFontFilterImported()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "fontFilterFavorite", "getFontFilterFavorite()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "fontLanguageFilter", "getFontLanguageFilter()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "fontSorting", "getFontSorting()Lcom/alightcreative/app/motion/persist/Persist$FontSortOrder;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "favoriteFonts", "getFavoriteFonts()Ljava/util/Set;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "recentlyUsedFonts", "getRecentlyUsedFonts()Lcom/alightcreative/app/motion/persist/RecentStrings;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "drawingPreview", "getDrawingPreview()Lcom/alightcreative/app/motion/persist/Persist$PreviewMode;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "demoModeMediaAndBuckets", "getDemoModeMediaAndBuckets()Ljava/util/Set;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "experimentalEffects", "getExperimentalEffects()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "experimentalFeatures", "getExperimentalFeatures()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "simulateUpload", "getSimulateUpload()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "reviewPopupResponse", "getReviewPopupResponse()Lcom/alightcreative/app/motion/persist/Persist$ReviewPopupResponse;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "liveShapeSizeFromCenter", "getLiveShapeSizeFromCenter()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "liveShapeLockAspect", "getLiveShapeLockAspect()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "specialEventPopupShown", "getSpecialEventPopupShown()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "videoExportInfo", "getVideoExportInfo()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "gifExportInfo", "getGifExportInfo()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "imgSeExportInfo", "getImgSeExportInfo()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "showedLagNotice", "getShowedLagNotice()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "showedLagNoticeDate", "getShowedLagNoticeDate()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "oomCount", "getOomCount()J", 0)), Reflection.property1(new PropertyReference1Impl(j.class, "projectEditTime", "getProjectEditTime()Ljava/util/Map;", 0)), Reflection.property1(new PropertyReference1Impl(j.class, "trackProjectEditTime", "getTrackProjectEditTime()Ljava/util/Map;", 0)), Reflection.property1(new PropertyReference1Impl(j.class, "seenElementDownloads", "getSeenElementDownloads()Ljava/util/Map;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "exportedProjectIds", "getExportedProjectIds()Ljava/util/Set;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "elementTabVisitTimestamp", "getElementTabVisitTimestamp()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "installDateTimestamp", "getInstallDateTimestamp()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "projectPackageFreeUserMaxDownloadSize", "getProjectPackageFreeUserMaxDownloadSize()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "miniColorPickerExpandAlpha", "getMiniColorPickerExpandAlpha()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "iapPopupCheckInfo", "getIapPopupCheckInfo()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(j.class, "iapPromptDelay", "getIapPromptDelay()Lcom/alightcreative/app/motion/persist/Persist$IAPPromptDelay;", 0)), Reflection.property1(new PropertyReference1Impl(j.class, "iapPrompt", "getIapPrompt()Lcom/alightcreative/app/motion/persist/Persist$IAPPormpt;", 0)), Reflection.property1(new PropertyReference1Impl(j.class, "iapPromptContentTest", "getIapPromptContentTest()Lcom/alightcreative/app/motion/persist/Persist$IAPPromptContent;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "lastSeenProjectCount", "getLastSeenProjectCount()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "lastSeenElementCount", "getLastSeenElementCount()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "easingOvershoot", "getEasingOvershoot()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "lastAppExecution", "getLastAppExecution()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "appDay", "getAppDay()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "wmPosition", "getWmPosition()Lcom/alightcreative/app/motion/persist/Persist$WMPosition;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "audioResamplerType", "getAudioResamplerType()Lcom/libsamplerate_kotlin/AudioResamplerType;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "appInstance", "getAppInstance()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "effectRecentFavSelectedPos", "getEffectRecentFavSelectedPos()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "showed36EffectBrowserPopup", "getShowed36EffectBrowserPopup()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "testEEA", "getTestEEA()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "mediaBucketID", "getMediaBucketID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "mediaBucketName", "getMediaBucketName()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "firebaseEmulatorAddress", "getFirebaseEmulatorAddress()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "useFirebaseEmulator", "getUseFirebaseEmulator()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "showBookmarkTooltip", "getShowBookmarkTooltip()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "showMBTooltip", "getShowMBTooltip()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "turnedOnCameraView", "getTurnedOnCameraView()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "showNewFeaturePopup", "getShowNewFeaturePopup()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "unlockedFeatures", "getUnlockedFeatures()Ljava/util/Set;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "usedNewFeatures", "getUsedNewFeatures()Ljava/util/Set;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "sessionNumber", "getSessionNumber()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "mediaAccessRequestNumber", "getMediaAccessRequestNumber()I", 0)), Reflection.property1(new PropertyReference1Impl(j.class, "adsWatchedForProject", "getAdsWatchedForProject()Ljava/util/Map;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "showNewTagForTemplates", "getShowNewTagForTemplates()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "showNewTagForAddTemplateElement", "getShowNewTagForAddTemplateElement()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "showNewTagForPresetsSubTab", "getShowNewTagForPresetsSubTab()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "showNewTagForPresetEditButton", "getShowNewTagForPresetEditButton()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "paywallNumber", "getPaywallNumber()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "forceFreeTrialEligibility", "getForceFreeTrialEligibility()Z", 0)), Reflection.property1(new PropertyReference1Impl(j.class, "cloudToLocalIdMap", "getCloudToLocalIdMap()Ljava/util/Map;", 0)), Reflection.property1(new PropertyReference1Impl(j.class, "unfinishedCloudUploadTimestamps", "getUnfinishedCloudUploadTimestamps()Ljava/util/Map;", 0)), Reflection.property1(new PropertyReference1Impl(j.class, "cloudSyncTimeMillis", "getCloudSyncTimeMillis()Ljava/util/Map;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "countdownPaywallStartTime", "getCountdownPaywallStartTime()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "countdownDiscountPercent", "getCountdownDiscountPercent()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "timeOffsetSeconds", "getTimeOffsetSeconds()I", 0)), Reflection.property1(new PropertyReference1Impl(j.class, YmsTEL.ztreO, "getVerifiedPurchaseExpirationTime()Ljava/util/Map;", 0)), Reflection.property1(new PropertyReference1Impl(j.class, "verifiedPurchaseUid", "getVerifiedPurchaseUid()Ljava/util/Map;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "lastSerializedFeed", "getLastSerializedFeed()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "lastFeedHash", "getLastFeedHash()Ljava/lang/String;", 0))};
    public static final j INSTANCE = new j();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class C {
        private static final /* synthetic */ EnumEntries E2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ C[] f45808g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C f45809n = new C("NONE", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C f45812t = new C("LATER", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final C f45805O = new C("RATE", 2);
        public static final C J2 = new C("FEEDBACK", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final C f45811r = new C("ENJOY", 4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final C f45810o = new C("ENJOY_NORATE", 5);

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final C f45807Z = new C("NEG", 6);

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final C f45806S = new C("NEG_NOFEEDBACK", 7);

        private static final /* synthetic */ C[] n() {
            return new C[]{f45809n, f45812t, f45805O, J2, f45811r, f45810o, f45807Z, f45806S};
        }

        static {
            C[] cArrN = n();
            f45808g = cArrN;
            E2 = EnumEntriesKt.enumEntries(cArrN);
        }

        public static C valueOf(String str) {
            return (C) Enum.valueOf(C.class, str);
        }

        public static C[] values() {
            return (C[]) f45808g.clone();
        }

        private C(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class CN3 {
        private static final /* synthetic */ CN3[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f45815r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final CN3 f45814n = new CN3("DEFAULT", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final CN3 f45816t = new CN3("TEN_MIN", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final CN3 f45813O = new CN3("IMMEDIATE", 2);

        private static final /* synthetic */ CN3[] n() {
            return new CN3[]{f45814n, f45816t, f45813O};
        }

        static {
            CN3[] cn3ArrN = n();
            J2 = cn3ArrN;
            f45815r = EnumEntriesKt.enumEntries(cn3ArrN);
        }

        public static CN3 valueOf(String str) {
            return (CN3) Enum.valueOf(CN3.class, str);
        }

        public static CN3[] values() {
            return (CN3[]) J2.clone();
        }

        private CN3(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Dsr {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ Dsr[] f45817O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Dsr f45818n = new Dsr("ALBUMS", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Dsr f45819t = new Dsr("TIMELINE", 1);

        private static final /* synthetic */ Dsr[] n() {
            return new Dsr[]{f45818n, f45819t};
        }

        static {
            Dsr[] dsrArrN = n();
            f45817O = dsrArrN;
            J2 = EnumEntriesKt.enumEntries(dsrArrN);
        }

        public static Dsr valueOf(String str) {
            return (Dsr) Enum.valueOf(Dsr.class, str);
        }

        public static Dsr[] values() {
            return (Dsr[]) f45817O.clone();
        }

        private Dsr(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class I28 {
        private static final /* synthetic */ I28[] E2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f45823e;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f45825n = new I28("DEFAULT", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final I28 f45828t = new I28("NONE", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final I28 f45820O = new I28("IAP", 2);
        public static final I28 J2 = new I28("A", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final I28 f45827r = new I28("B", 4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final I28 f45826o = new I28("C", 5);

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final I28 f45822Z = new I28("D", 6);

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final I28 f45821S = new I28("E", 7);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final I28 f45824g = new I28("F", 8);

        private static final /* synthetic */ I28[] n() {
            return new I28[]{f45825n, f45828t, f45820O, J2, f45827r, f45826o, f45822Z, f45821S, f45824g};
        }

        static {
            I28[] i28ArrN = n();
            E2 = i28ArrN;
            f45823e = EnumEntriesKt.enumEntries(i28ArrN);
        }

        public static I28 valueOf(String str) {
            return (I28) Enum.valueOf(I28.class, str);
        }

        public static I28[] values() {
            return (I28[]) E2.clone();
        }

        private I28(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Ml {
        private static final /* synthetic */ Ml[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f45831r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f45830n = new Ml("LOW", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Ml f45832t = new Ml("REDUCED", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Ml f45829O = new Ml("FULL", 2);

        private static final /* synthetic */ Ml[] n() {
            return new Ml[]{f45830n, f45832t, f45829O};
        }

        static {
            Ml[] mlArrN = n();
            J2 = mlArrN;
            f45831r = EnumEntriesKt.enumEntries(mlArrN);
        }

        public static Ml valueOf(String str) {
            return (Ml) Enum.valueOf(Ml.class, str);
        }

        public static Ml[] values() {
            return (Ml[]) J2.clone();
        }

        private Ml(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Pl {
        private static final /* synthetic */ Pl[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f45835r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Pl f45834n = new Pl("H264AVC", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Pl f45836t = new Pl("H265HEVC", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Pl f45833O = new Pl("NONE", 2);

        private static final /* synthetic */ Pl[] n() {
            return new Pl[]{f45834n, f45836t, f45833O};
        }

        static {
            Pl[] plArrN = n();
            J2 = plArrN;
            f45835r = EnumEntriesKt.enumEntries(plArrN);
        }

        public static Pl valueOf(String str) {
            return (Pl) Enum.valueOf(Pl.class, str);
        }

        public static Pl[] values() {
            return (Pl[]) J2.clone();
        }

        private Pl(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Wre {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f45839o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ Wre[] f45840r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Wre f45838n = new Wre("DEFAULT", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Wre f45841t = new Wre("NONE", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Wre f45837O = new Wre("BASIC", 2);
        public static final Wre J2 = new Wre("ALL", 3);

        private static final /* synthetic */ Wre[] n() {
            return new Wre[]{f45838n, f45841t, f45837O, J2};
        }

        static {
            Wre[] wreArrN = n();
            f45840r = wreArrN;
            f45839o = EnumEntriesKt.enumEntries(wreArrN);
        }

        public static Wre valueOf(String str) {
            return (Wre) Enum.valueOf(Wre.class, str);
        }

        public static Wre[] values() {
            return (Wre[]) f45840r.clone();
        }

        private Wre(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Xo {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ Xo[] f45842O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Xo f45843n = new Xo("Top", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Xo f45844t = new Xo("Bottom", 1);

        private static final /* synthetic */ Xo[] n() {
            return new Xo[]{f45843n, f45844t};
        }

        static {
            Xo[] xoArrN = n();
            f45842O = xoArrN;
            J2 = EnumEntriesKt.enumEntries(xoArrN);
        }

        public static Xo valueOf(String str) {
            return (Xo) Enum.valueOf(Xo.class, str);
        }

        public static Xo[] values() {
            return (Xo[]) f45842O.clone();
        }

        private Xo(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class aC {
        private static final /* synthetic */ aC[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f45847r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final aC f45846n = new aC("NORMAL", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final aC f45848t = new aC("NO_EFFECTS", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final aC f45845O = new aC("MIXED", 2);

        private static final /* synthetic */ aC[] n() {
            return new aC[]{f45846n, f45848t, f45845O};
        }

        static {
            aC[] aCVarArrN = n();
            J2 = aCVarArrN;
            f45847r = EnumEntriesKt.enumEntries(aCVarArrN);
        }

        public static aC valueOf(String str) {
            return (aC) Enum.valueOf(aC.class, str);
        }

        public static aC[] values() {
            return (aC[]) J2.clone();
        }

        private aC(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class fuX {
        private static final /* synthetic */ fuX[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f45851r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final fuX f45850n = new fuX("PNG", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final fuX f45852t = new fuX("JPEG", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final fuX f45849O = new fuX("NONE", 2);

        private static final /* synthetic */ fuX[] n() {
            return new fuX[]{f45850n, f45852t, f45849O};
        }

        static {
            fuX[] fuxArrN = n();
            J2 = fuxArrN;
            f45851r = EnumEntriesKt.enumEntries(fuxArrN);
        }

        public static fuX valueOf(String str) {
            return (fuX) Enum.valueOf(fuX.class, str);
        }

        public static fuX[] values() {
            return (fuX[]) J2.clone();
        }

        private fuX(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.alightcreative.app.motion.persist.j$j, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class EnumC0648j {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f45854Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumC0648j[] f45856o;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final EnumC0648j f45855n = new EnumC0648j("SONGS", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final EnumC0648j f45858t = new EnumC0648j("ALBUMS", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final EnumC0648j f45853O = new EnumC0648j("ARTISTS", 2);
        public static final EnumC0648j J2 = new EnumC0648j("GENRES", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final EnumC0648j f45857r = new EnumC0648j("FOLDERS", 4);

        private static final /* synthetic */ EnumC0648j[] n() {
            return new EnumC0648j[]{f45855n, f45858t, f45853O, J2, f45857r};
        }

        static {
            EnumC0648j[] enumC0648jArrN = n();
            f45856o = enumC0648jArrN;
            f45854Z = EnumEntriesKt.enumEntries(enumC0648jArrN);
        }

        public static EnumC0648j valueOf(String str) {
            return (EnumC0648j) Enum.valueOf(EnumC0648j.class, str);
        }

        public static EnumC0648j[] values() {
            return (EnumC0648j[]) f45856o.clone();
        }

        private EnumC0648j(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class n {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f45860S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ n[] f45861Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f45862n = new n("BLACK", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f45865t = new n("WHITE", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f45859O = new n("LIGHT_GREY", 2);
        public static final n J2 = new n("GREEN", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final n f45864r = new n("BLUE", 4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final n f45863o = new n("TRANSPARENT", 5);

        private static final /* synthetic */ n[] n() {
            return new n[]{f45862n, f45865t, f45859O, J2, f45864r, f45863o};
        }

        static {
            n[] nVarArrN = n();
            f45861Z = nVarArrN;
            f45860S = EnumEntriesKt.enumEntries(nVarArrN);
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f45861Z.clone();
        }

        private n(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class o {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ o[] f45866O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final o f45867n = new o("Elements", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final o f45868t = new o("Projects", 1);

        private static final /* synthetic */ o[] n() {
            return new o[]{f45867n, f45868t};
        }

        static {
            o[] oVarArrN = n();
            f45866O = oVarArrN;
            J2 = EnumEntriesKt.enumEntries(oVarArrN);
        }

        public static o valueOf(String str) {
            return (o) Enum.valueOf(o.class, str);
        }

        public static o[] values() {
            return (o[]) f45866O.clone();
        }

        private o(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class qz {
        private static final /* synthetic */ qz[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f45871r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final qz f45870n = new qz("NAME", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final qz f45872t = new qz("MODIFIED_ASC", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final qz f45869O = new qz("MODIFIED_DESC", 2);

        private static final /* synthetic */ qz[] n() {
            return new qz[]{f45870n, f45872t, f45869O};
        }

        static {
            qz[] qzVarArrN = n();
            J2 = qzVarArrN;
            f45871r = EnumEntriesKt.enumEntries(qzVarArrN);
        }

        public static qz valueOf(String str) {
            return (qz) Enum.valueOf(qz.class, str);
        }

        public static qz[] values() {
            return (qz[]) J2.clone();
        }

        private qz(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class w6 {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ w6[] f45873O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f45874n = new w6("ALPHA", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f45875t = new w6("POPULAR", 1);

        private static final /* synthetic */ w6[] n() {
            return new w6[]{f45874n, f45875t};
        }

        static {
            w6[] w6VarArrN = n();
            f45873O = w6VarArrN;
            J2 = EnumEntriesKt.enumEntries(w6VarArrN);
        }

        public static w6 valueOf(String str) {
            return (w6) Enum.valueOf(w6.class, str);
        }

        public static w6[] values() {
            return (w6[]) f45873O.clone();
        }

        private w6(String str, int i2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z2 = false;
        int i2 = 0;
        int i3 = 2;
        int i5 = 5;
        int i7 = 10;
        int i8 = 20;
        Boolean bool = Boolean.FALSE;
        emulatingGLSLMinMaxClamp$delegate = new com.alightcreative.app.motion.persist.Ml(bool, false, false, 6, null);
        boolean z3 = false;
        colorSelector$delegate = new com.alightcreative.app.motion.persist.Ml(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"#ffff4444", "#fff4b446", "#fffae965", "#ff1ed91e", "#ff17e1e1", "#ff3d4cf5", "#ffdd44dd", HrvQKfmFZJudBc.YClOitxHY, "#ffbebebe", "#ff888888", "#ff444444", "#ff000000", "#ff5eb7d9", "#ff98c99c"}), ",", null, null, 0, null, null, 62, null), false, z3, 6, null);
        boolean z4 = false;
        drawingTool$delegate = new com.alightcreative.app.motion.persist.Ml("PEN", z3, z4, 6, null);
        boolean z5 = false;
        drawingColor$delegate = new com.alightcreative.app.motion.persist.Ml(qf.rl(-16776961), z4, z5, 6, null);
        drawingStrokeWidth$delegate = new com.alightcreative.app.motion.persist.Ml(Float.valueOf(5.0f), z5, false, 6, null);
        int i9 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z6 = false;
        boolean z7 = false;
        controlpadAccel$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z6, z7, i9, defaultConstructorMarker);
        grayTheme$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z6, z7, i9, defaultConstructorMarker);
        boolean z9 = false;
        mediaBrowserMode$delegate = new com.alightcreative.app.motion.persist.Ml(Dsr.f45819t, false, z9, 6, null);
        boolean z10 = false;
        audioBrowserMode$delegate = new com.alightcreative.app.motion.persist.Ml(EnumC0648j.f45855n, z9, z10, 6, null);
        sceneBrowserMode$delegate = new com.alightcreative.app.motion.persist.Ml(o.f45867n, z10, false, 6, null);
        int iMin = Math.min(1080, AbstractC2487Wre.mUb().J2());
        if (iMin <= 0) {
            iMin = 540;
        }
        boolean z11 = false;
        projectPresetRes$delegate = new com.alightcreative.app.motion.persist.Ml(Integer.valueOf(iMin), false, z11, 6, null);
        boolean z12 = false;
        projectPresetFps$delegate = new com.alightcreative.app.motion.persist.Ml(30, z11, z12, 6, null);
        newProjectAspect$delegate = new com.alightcreative.app.motion.persist.Ml("16:9", z12, false, 6, null);
        int iMin2 = Math.min(1080, AbstractC2487Wre.mUb().J2());
        if (iMin2 <= 0) {
            iMin2 = 540;
        }
        newProjectRes$delegate = new com.alightcreative.app.motion.persist.Ml(Integer.valueOf(iMin2), false, false, 6, null);
        int iMin3 = Math.min(1080, AbstractC2487Wre.mUb().J2());
        if (iMin3 <= 0) {
            iMin3 = 540;
        }
        newProjectCustomHeight$delegate = new com.alightcreative.app.motion.persist.Ml(Integer.valueOf(iMin3), false, false, 6, null);
        int iMin4 = Math.min(1080, AbstractC2487Wre.mUb().J2());
        boolean z13 = false;
        newProjectCustomWidth$delegate = new com.alightcreative.app.motion.persist.Ml(Integer.valueOf(((iMin4 > 0 ? iMin4 : 540) * 16) / 9), false, z13, 6, null);
        boolean z14 = false;
        newProjectFps$delegate = new com.alightcreative.app.motion.persist.Ml(30, z13, z14, 6, null);
        newProjectBg$delegate = new com.alightcreative.app.motion.persist.Ml(n.f45859O, z14, false, 6, null);
        Boolean bool2 = Boolean.TRUE;
        boolean z15 = false;
        newProjectCustomSizeLink$delegate = new com.alightcreative.app.motion.persist.Ml(bool2, false, z15, 6, null);
        int i10 = 6;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z16 = false;
        boolean z17 = false;
        miniMediaBrowserAudioMode$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z16, z17, i10, defaultConstructorMarker2);
        watermark$delegate = new com.alightcreative.app.motion.persist.Ml(bool2, z15, false, 6, null);
        int i11 = 6;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        boolean z18 = false;
        boolean z19 = false;
        projectsCreated$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z18, z19, i11, defaultConstructorMarker3);
        projectsExported$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z18, z19, i11, defaultConstructorMarker3);
        projectsShared$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z18, z19, i11, defaultConstructorMarker3);
        int i12 = 6;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        boolean z20 = false;
        boolean z21 = false;
        projectSortOrder$delegate = new com.alightcreative.app.motion.persist.Ml(qz.f45869O, z20, z21, i12, defaultConstructorMarker4);
        loopingPlay$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z16, z17, i10, defaultConstructorMarker2);
        agreedPrivacy$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z16, z17, i10, defaultConstructorMarker2);
        agreedPrivacyPolicyVersion$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z18, z19, i11, defaultConstructorMarker3);
        onboardingCompletedOrSkipped$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z16, z17, i10, defaultConstructorMarker2);
        thumbBounds$delegate = new com.alightcreative.app.motion.persist.Ml("element", z20, z21, i12, defaultConstructorMarker4);
        sendDeviceIDWithCrashes$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z16, z17, i10, defaultConstructorMarker2);
        deviceID$delegate = new com.alightcreative.app.motion.persist.Ml("", z20, z21, i12, defaultConstructorMarker4);
        vsalt$delegate = new com.alightcreative.app.motion.persist.Ml("", z21, false, 6, null);
        iaptest$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z16, z17, i10, defaultConstructorMarker2);
        demoMode$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z16, z17, i10, defaultConstructorMarker2);
        userDemoMode$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z16, z17, i10, defaultConstructorMarker2);
        DefaultConstructorMarker defaultConstructorMarker5 = null;
        acctTestMode$delegate = new com.alightcreative.app.motion.persist.Ml("normal", z17, false, 6, defaultConstructorMarker5);
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker6 = null;
        boolean z22 = false;
        defaultLayerDuration$delegate = new com.alightcreative.app.motion.persist.Ml(2000, z22, z21, i13, defaultConstructorMarker6);
        skulist$delegate = new com.alightcreative.app.motion.persist.CN3("");
        skuList$delegate = new com.alightcreative.app.motion.persist.CN3("");
        skuListFetched$delegate = new com.alightcreative.app.motion.persist.CN3(0L);
        skuListNeedsRefresh$delegate = new com.alightcreative.app.motion.persist.CN3(bool);
        skuListUid$delegate = new com.alightcreative.app.motion.persist.CN3("");
        skuListBuildVersionCode$delegate = new com.alightcreative.app.motion.persist.CN3(0);
        accountInfoCacheDate$delegate = new com.alightcreative.app.motion.persist.CN3(0L);
        LICENSE_CACHE_VERSION = 1L;
        licenseCacheVersion$delegate = new com.alightcreative.app.motion.persist.CN3(0L);
        licenseInfo$delegate = new com.alightcreative.app.motion.persist.CN3("");
        licenseUid$delegate = new com.alightcreative.app.motion.persist.CN3("");
        accountCreated$delegate = new com.alightcreative.app.motion.persist.CN3(0L);
        latestServerTimeMillis$delegate = new com.alightcreative.app.motion.persist.CN3(0L);
        int i14 = 6;
        DefaultConstructorMarker defaultConstructorMarker7 = null;
        boolean z23 = false;
        boolean z24 = false;
        deviceCapsCheckProd$delegate = new com.alightcreative.app.motion.persist.Ml("", z23, z24, i14, defaultConstructorMarker7);
        boolean z25 = false;
        boolean z26 = false;
        deviceCapsCheckVer$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z25, z26, i11, defaultConstructorMarker3);
        maxLayers720$delegate = new com.alightcreative.app.motion.persist.Ml(-2, z23, z24, i14, defaultConstructorMarker7);
        boolean z27 = false;
        maxLayers1080$delegate = new com.alightcreative.app.motion.persist.Ml(-2, z24, z27, 6, null);
        maxLayers1440$delegate = new com.alightcreative.app.motion.persist.Ml(-2, z27, false, 6, defaultConstructorMarker5);
        maxLayers2160$delegate = new com.alightcreative.app.motion.persist.Ml(-2, z22, z21, i13, defaultConstructorMarker6);
        boolean z28 = false;
        maxRes$delegate = new com.alightcreative.app.motion.persist.Ml(-1, false, z28, 6, null);
        int i15 = 6;
        DefaultConstructorMarker defaultConstructorMarker8 = null;
        boolean z29 = false;
        maxResWithVideo$delegate = new com.alightcreative.app.motion.persist.Ml(-1, z28, z29, i15, defaultConstructorMarker8);
        deviceCapsCheckAttempts$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z25, z26, i11, defaultConstructorMarker3);
        deviceCapsCheckBypassed$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z28, z29, i15, defaultConstructorMarker8);
        deviceCapsCheckSuccess$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z28, z29, i15, defaultConstructorMarker8);
        int i16 = 6;
        DefaultConstructorMarker defaultConstructorMarker9 = null;
        boolean z30 = false;
        boolean z31 = false;
        deviceCapsCheckSource$delegate = new com.alightcreative.app.motion.persist.Ml("", z30, z31, i16, defaultConstructorMarker9);
        deviceCapsAvailableInDb$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z28, z29, i15, defaultConstructorMarker8);
        stagingFeed$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z28, z29, i15, defaultConstructorMarker8);
        iapSimulateBadToken$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z28, z29, i15, defaultConstructorMarker8);
        lastApkValidation$delegate = new com.alightcreative.app.motion.persist.CN3(0L);
        lastApkValidationAttempt$delegate = new com.alightcreative.app.motion.persist.CN3(0L);
        firstAppExec$delegate = new com.alightcreative.app.motion.persist.CN3(0L);
        apkInvalid$delegate = new com.alightcreative.app.motion.persist.CN3(bool);
        updateSp$delegate = new com.alightcreative.app.motion.persist.CN3(bool);
        mandatoryUpdateVer$delegate = new com.alightcreative.app.motion.persist.CN3(0);
        useTestAds$delegate = new com.alightcreative.app.motion.persist.Ml(bool2, false, false, 6, null);
        useInterstitialVideoTestAds$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z28, z29, i15, defaultConstructorMarker8);
        colorTab$delegate = new com.alightcreative.app.motion.persist.Ml("wheel", z30, z31, i16, defaultConstructorMarker9);
        boolean z32 = false;
        boolean z33 = false;
        recentlyUsedAudios$delegate = new com.alightcreative.app.motion.persist.Ml(new com.alightcreative.app.motion.persist.w6(i5, null, i3, null == true ? 1 : 0), z32, z33, i13, defaultConstructorMarker6);
        recentlyUsedMedia$delegate = new com.alightcreative.app.motion.persist.Ml(new com.alightcreative.app.motion.persist.w6(i7, null == true ? 1 : 0, i3, null == true ? 1 : 0), z30, z31, i16, defaultConstructorMarker9);
        recentMediaSize$delegate = new com.alightcreative.app.motion.persist.Ml("0", z32, z33, i13, defaultConstructorMarker6);
        acDevMode$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z28, z29, i15, defaultConstructorMarker8);
        feedIgnorePubDate$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z28, z29, i15, defaultConstructorMarker8);
        profilingHud$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z28, z29, i15, defaultConstructorMarker8);
        disableRenderPerformanceTrace$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z28, z29, i15, defaultConstructorMarker8);
        int i17 = 4;
        boolean z34 = true;
        recentlyUsedEffects$delegate = new com.alightcreative.app.motion.persist.Ml(new com.alightcreative.app.motion.persist.w6(i8, null, i3, null == true ? 1 : 0), z34, z31, i17, defaultConstructorMarker9);
        int i18 = 4;
        boolean z35 = true;
        recentlyUsedEffectTags$delegate = new com.alightcreative.app.motion.persist.Ml(new com.alightcreative.app.motion.persist.w6(i8, null == true ? 1 : 0, i3, null == true ? 1 : 0), z35, z33, i18, defaultConstructorMarker6);
        favoriteEffects$delegate = new com.alightcreative.app.motion.persist.Ml(SetsKt.emptySet(), z34, z31, i17, defaultConstructorMarker9);
        importedProjectIds$delegate = new com.alightcreative.app.motion.persist.Ml(SetsKt.emptySet(), z35, z33, i18, defaultConstructorMarker6);
        importedXmlIds$delegate = new com.alightcreative.app.motion.persist.Ml(SetsKt.emptySet(), z34, z31, i17, defaultConstructorMarker9);
        installedAppVersions$delegate = new com.alightcreative.app.motion.persist.Ml(SetsKt.emptySet(), z35, z33, i18, defaultConstructorMarker6);
        lowQualityPreview$delegate = new com.alightcreative.app.motion.persist.Ml(bool, true, z29, 4, defaultConstructorMarker8);
        int i19 = 6;
        boolean z36 = false;
        fontFilterSerif$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z29, i19, defaultConstructorMarker8);
        fontFilterSansSerif$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z29, i19, defaultConstructorMarker8);
        fontFilterDisplay$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z29, i19, defaultConstructorMarker8);
        fontFilterHandwriting$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z29, i19, defaultConstructorMarker8);
        fontFilterMonospace$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z29, i19, defaultConstructorMarker8);
        fontFilterImported$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z29, i19, defaultConstructorMarker8);
        fontFilterFavorite$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z29, i19, defaultConstructorMarker8);
        fontLanguageFilter$delegate = new com.alightcreative.app.motion.persist.Ml(i2, false, false, 6, null);
        int i20 = 6;
        boolean z37 = false;
        boolean z38 = false;
        fontSorting$delegate = new com.alightcreative.app.motion.persist.Ml(w6.f45875t, z37, z38, i20, defaultConstructorMarker9);
        int i21 = 6;
        boolean z39 = false;
        favoriteFonts$delegate = new com.alightcreative.app.motion.persist.Ml(SetsKt.emptySet(), z39, z33, i21, defaultConstructorMarker6);
        recentlyUsedFonts$delegate = new com.alightcreative.app.motion.persist.Ml(new com.alightcreative.app.motion.persist.w6(i8, null, i3, null == true ? 1 : 0), z37, z38, i20, defaultConstructorMarker9);
        drawingPreview$delegate = new com.alightcreative.app.motion.persist.Ml(aC.f45846n, z39, z33, i21, defaultConstructorMarker6);
        demoModeMediaAndBuckets$delegate = new com.alightcreative.app.motion.persist.Ml(SetsKt.emptySet(), z37, z38, i20, defaultConstructorMarker9);
        experimentalEffects$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z29, i19, defaultConstructorMarker8);
        experimentalFeatures$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z29, i19, defaultConstructorMarker8);
        simulateUpload$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z29, i19, defaultConstructorMarker8);
        reviewPopupResponse$delegate = new com.alightcreative.app.motion.persist.Ml(C.f45809n, z37, z38, i20, defaultConstructorMarker9);
        int i22 = 6;
        DefaultConstructorMarker defaultConstructorMarker10 = null;
        boolean z40 = false;
        boolean z41 = false;
        liveShapeSizeFromCenter$delegate = new com.alightcreative.app.motion.persist.Ml(bool2, z40, z41, i22, defaultConstructorMarker10);
        liveShapeLockAspect$delegate = new com.alightcreative.app.motion.persist.Ml(bool2, z40, z41, i22, defaultConstructorMarker10);
        specialEventPopupShown$delegate = new com.alightcreative.app.motion.persist.Ml("", z37, z38, i20, defaultConstructorMarker9);
        boolean z42 = false;
        boolean z43 = false;
        videoExportInfo$delegate = new com.alightcreative.app.motion.persist.Ml("", z42, z43, i21, defaultConstructorMarker6);
        gifExportInfo$delegate = new com.alightcreative.app.motion.persist.Ml("", z37, z38, i20, defaultConstructorMarker9);
        imgSeExportInfo$delegate = new com.alightcreative.app.motion.persist.Ml("", z42, z43, i21, defaultConstructorMarker6);
        showedLagNotice$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z29, i19, defaultConstructorMarker8);
        showedLagNoticeDate$delegate = new com.alightcreative.app.motion.persist.Ml(0L, z37, z38, i20, defaultConstructorMarker9);
        int i23 = 6;
        DefaultConstructorMarker defaultConstructorMarker11 = null;
        boolean z44 = false;
        oomCount$delegate = new com.alightcreative.app.motion.persist.Ml(0L, z44, z36, i23, defaultConstructorMarker11);
        projectEditTime$delegate = new com.alightcreative.app.motion.persist.I28(-1L, true);
        trackProjectEditTime$delegate = new com.alightcreative.app.motion.persist.I28(bool, true);
        seenElementDownloads$delegate = new com.alightcreative.app.motion.persist.I28(0L, true);
        exportedProjectIds$delegate = new com.alightcreative.app.motion.persist.Ml(SetsKt.emptySet(), z37, z38, i20, defaultConstructorMarker9);
        elementTabVisitTimestamp$delegate = new com.alightcreative.app.motion.persist.Ml(0L, z44, z36, i23, defaultConstructorMarker11);
        installDateTimestamp$delegate = new com.alightcreative.app.motion.persist.Ml(0L, z37, z38, i20, defaultConstructorMarker9);
        projectPackageFreeUserMaxDownloadSize$delegate = new com.alightcreative.app.motion.persist.Ml(0L, z44, z36, i23, defaultConstructorMarker11);
        miniColorPickerExpandAlpha$delegate = new com.alightcreative.app.motion.persist.Ml(bool2, false, false, 6, null);
        iapPopupCheckInfo$delegate = new com.alightcreative.app.motion.persist.Ml("", z37, z38, i20, defaultConstructorMarker9);
        iapPromptDelay$delegate = new com.alightcreative.app.motion.persist.Ml(CN3.f45814n, z44, z36, i23, defaultConstructorMarker11);
        iapPrompt$delegate = new com.alightcreative.app.motion.persist.Ml(I28.f45825n, z37, z38, i20, defaultConstructorMarker9);
        iapPromptContentTest$delegate = new com.alightcreative.app.motion.persist.Ml(Wre.f45838n, z44, z36, i23, defaultConstructorMarker11);
        int i24 = 6;
        DefaultConstructorMarker defaultConstructorMarker12 = null;
        boolean z45 = false;
        boolean z46 = false;
        lastSeenProjectCount$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z45, z46, i24, defaultConstructorMarker12);
        lastSeenElementCount$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z45, z46, i24, defaultConstructorMarker12);
        int i25 = 6;
        boolean z47 = false;
        easingOvershoot$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z47, i25, defaultConstructorMarker8);
        lastAppExecution$delegate = new com.alightcreative.app.motion.persist.Ml(0L, false, false, i20, defaultConstructorMarker9);
        appDay$delegate = new com.alightcreative.app.motion.persist.Ml(i2, false, false, 6, null);
        boolean z48 = false;
        boolean z49 = false;
        wmPosition$delegate = new com.alightcreative.app.motion.persist.Ml(Xo.f45843n, z48, z49, i20, defaultConstructorMarker9);
        boolean z50 = false;
        boolean z51 = false;
        audioResamplerType$delegate = new com.alightcreative.app.motion.persist.Ml(Mgn.j.f6646O, z50, z51, i21, defaultConstructorMarker6);
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        appInstance$delegate = new com.alightcreative.app.motion.persist.Ml(string, z48, z49, i20, defaultConstructorMarker9);
        effectRecentFavSelectedPos$delegate = new com.alightcreative.app.motion.persist.Ml(i2, false, false, 6, null);
        showed36EffectBrowserPopup$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z47, i25, defaultConstructorMarker8);
        testEEA$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z47, i25, defaultConstructorMarker8);
        boolean z52 = false;
        boolean z53 = false;
        mediaBucketID$delegate = new com.alightcreative.app.motion.persist.Ml("", z52, z53, i20, defaultConstructorMarker9);
        mediaBucketName$delegate = new com.alightcreative.app.motion.persist.Ml("", z50, z51, i21, defaultConstructorMarker6);
        firebaseEmulatorAddress$delegate = new com.alightcreative.app.motion.persist.Ml("", z52, z53, i20, defaultConstructorMarker9);
        useFirebaseEmulator$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z47, i25, defaultConstructorMarker8);
        showBookmarkTooltip$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z47, i25, defaultConstructorMarker8);
        showMBTooltip$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z47, i25, defaultConstructorMarker8);
        turnedOnCameraView$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z47, i25, defaultConstructorMarker8);
        showNewFeaturePopup$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z47, i25, defaultConstructorMarker8);
        unlockedFeatures$delegate = new com.alightcreative.app.motion.persist.Ml(SetsKt.emptySet(), z52, z53, i20, defaultConstructorMarker9);
        usedNewFeatures$delegate = new com.alightcreative.app.motion.persist.Ml(SetsKt.emptySet(), true, z51, 4, defaultConstructorMarker6);
        int i26 = 6;
        DefaultConstructorMarker defaultConstructorMarker13 = null;
        boolean z54 = false;
        boolean z55 = false;
        sessionNumber$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z54, z55, i26, defaultConstructorMarker13);
        mediaAccessRequestNumber$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z54, z55, i26, defaultConstructorMarker13);
        adsWatchedForProject$delegate = new com.alightcreative.app.motion.persist.I28(i2, z2, i3, null);
        int i27 = 6;
        DefaultConstructorMarker defaultConstructorMarker14 = null;
        boolean z56 = false;
        boolean z57 = false;
        showNewTagForTemplates$delegate = new com.alightcreative.app.motion.persist.Ml(bool2, z56, z57, i27, defaultConstructorMarker14);
        showNewTagForAddTemplateElement$delegate = new com.alightcreative.app.motion.persist.Ml(bool2, z56, z57, i27, defaultConstructorMarker14);
        showNewTagForPresetsSubTab$delegate = new com.alightcreative.app.motion.persist.Ml(bool2, z56, z57, i27, defaultConstructorMarker14);
        showNewTagForPresetEditButton$delegate = new com.alightcreative.app.motion.persist.Ml(bool2, z56, z57, i27, defaultConstructorMarker14);
        paywallNumber$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z54, z55, i26, defaultConstructorMarker13);
        forceFreeTrialEligibility$delegate = new com.alightcreative.app.motion.persist.Ml(bool, z36, z47, i25, defaultConstructorMarker8);
        cloudToLocalIdMap$delegate = new com.alightcreative.app.motion.persist.I28("", true);
        unfinishedCloudUploadTimestamps$delegate = new com.alightcreative.app.motion.persist.I28(0L, true);
        cloudSyncTimeMillis$delegate = new com.alightcreative.app.motion.persist.I28(0L, true);
        countdownPaywallStartTime$delegate = new com.alightcreative.app.motion.persist.Ml(0L, false, false, i20, defaultConstructorMarker9);
        int i28 = 4;
        DefaultConstructorMarker defaultConstructorMarker15 = null;
        boolean z58 = true;
        boolean z59 = false;
        countdownDiscountPercent$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z58, z59, i28, defaultConstructorMarker15);
        timeOffsetSeconds$delegate = new com.alightcreative.app.motion.persist.Ml(i2, z58, z59, i28, defaultConstructorMarker15);
        verifiedPurchaseExpirationTime$delegate = new com.alightcreative.app.motion.persist.I28(0L, true);
        verifiedPurchaseUid$delegate = new com.alightcreative.app.motion.persist.I28("-", true);
        lastSerializedFeed$delegate = new com.alightcreative.app.motion.persist.Ml("", true, false, 4, null);
        lastFeedHash$delegate = new com.alightcreative.app.motion.persist.Ml("", true, false, 4, null);
        $stable = 8;
    }

    @Deprecated(message = "Mini browser for audio is separated; don't use this preference")
    public static /* synthetic */ void getMiniMediaBrowserAudioMode$annotations() {
    }

    @Deprecated(message = "This persist key has been deprecated following a change of the data structure that it was serializing.", replaceWith = @ReplaceWith(expression = "Persist.skuList", imports = {}))
    public static /* synthetic */ void getSkulist$annotations() {
    }

    public final boolean getAcDevMode() {
        return ((Boolean) acDevMode$delegate.rl(this, $$delegatedProperties[77])).booleanValue();
    }

    public final long getAccountCreated() {
        return ((Number) accountCreated$delegate.rl(this, $$delegatedProperties[48])).longValue();
    }

    public final long getAccountInfoCacheDate() {
        return ((Number) accountInfoCacheDate$delegate.rl(this, $$delegatedProperties[44])).longValue();
    }

    public final String getAcctTestMode() {
        return (String) acctTestMode$delegate.rl(this, $$delegatedProperties[36]);
    }

    public final Map<String, Integer> getAdsWatchedForProject() {
        return adsWatchedForProject$delegate.n(this, $$delegatedProperties[149]);
    }

    public final boolean getAgreedPrivacy() {
        return ((Boolean) agreedPrivacy$delegate.rl(this, $$delegatedProperties[26])).booleanValue();
    }

    public final int getAgreedPrivacyPolicyVersion() {
        return ((Number) agreedPrivacyPolicyVersion$delegate.rl(this, $$delegatedProperties[27])).intValue();
    }

    public final boolean getApkInvalid() {
        return ((Boolean) apkInvalid$delegate.rl(this, $$delegatedProperties[68])).booleanValue();
    }

    public final int getAppDay() {
        return ((Number) appDay$delegate.rl(this, $$delegatedProperties[130])).intValue();
    }

    public final String getAppInstance() {
        return (String) appInstance$delegate.rl(this, $$delegatedProperties[133]);
    }

    public final EnumC0648j getAudioBrowserMode() {
        return (EnumC0648j) audioBrowserMode$delegate.rl(this, $$delegatedProperties[8]);
    }

    public final Mgn.j getAudioResamplerType() {
        return (Mgn.j) audioResamplerType$delegate.rl(this, $$delegatedProperties[132]);
    }

    public final Map<String, Long> getCloudSyncTimeMillis() {
        return cloudSyncTimeMillis$delegate.n(this, $$delegatedProperties[158]);
    }

    public final Map<String, String> getCloudToLocalIdMap() {
        return cloudToLocalIdMap$delegate.n(this, $$delegatedProperties[156]);
    }

    public final String getColorSelector() {
        return (String) colorSelector$delegate.rl(this, $$delegatedProperties[1]);
    }

    public final String getColorTab() {
        return (String) colorTab$delegate.rl(this, $$delegatedProperties[73]);
    }

    public final boolean getControlpadAccel() {
        return ((Boolean) controlpadAccel$delegate.rl(this, $$delegatedProperties[5])).booleanValue();
    }

    public final int getCountdownDiscountPercent() {
        return ((Number) countdownDiscountPercent$delegate.rl(this, $$delegatedProperties[160])).intValue();
    }

    public final long getCountdownPaywallStartTime() {
        return ((Number) countdownPaywallStartTime$delegate.rl(this, $$delegatedProperties[159])).longValue();
    }

    public final int getDefaultLayerDuration() {
        return ((Number) defaultLayerDuration$delegate.rl(this, $$delegatedProperties[37])).intValue();
    }

    public final boolean getDemoMode() {
        return ((Boolean) demoMode$delegate.rl(this, $$delegatedProperties[34])).booleanValue();
    }

    public final Set<String> getDemoModeMediaAndBuckets() {
        return (Set) demoModeMediaAndBuckets$delegate.rl(this, $$delegatedProperties[100]);
    }

    public final boolean getDeviceCapsAvailableInDb() {
        return ((Boolean) deviceCapsAvailableInDb$delegate.rl(this, $$delegatedProperties[62])).booleanValue();
    }

    public final int getDeviceCapsCheckAttempts() {
        return ((Number) deviceCapsCheckAttempts$delegate.rl(this, $$delegatedProperties[58])).intValue();
    }

    public final boolean getDeviceCapsCheckBypassed() {
        return ((Boolean) deviceCapsCheckBypassed$delegate.rl(this, $$delegatedProperties[59])).booleanValue();
    }

    public final String getDeviceCapsCheckProd() {
        return (String) deviceCapsCheckProd$delegate.rl(this, $$delegatedProperties[50]);
    }

    public final String getDeviceCapsCheckSource() {
        return (String) deviceCapsCheckSource$delegate.rl(this, $$delegatedProperties[61]);
    }

    public final boolean getDeviceCapsCheckSuccess() {
        return ((Boolean) deviceCapsCheckSuccess$delegate.rl(this, $$delegatedProperties[60])).booleanValue();
    }

    public final int getDeviceCapsCheckVer() {
        return ((Number) deviceCapsCheckVer$delegate.rl(this, $$delegatedProperties[51])).intValue();
    }

    public final String getDeviceID() {
        return (String) deviceID$delegate.rl(this, $$delegatedProperties[31]);
    }

    public final boolean getDisableRenderPerformanceTrace() {
        return ((Boolean) disableRenderPerformanceTrace$delegate.rl(this, $$delegatedProperties[80])).booleanValue();
    }

    public final String getDrawingColor() {
        return (String) drawingColor$delegate.rl(this, $$delegatedProperties[3]);
    }

    public final aC getDrawingPreview() {
        return (aC) drawingPreview$delegate.rl(this, $$delegatedProperties[99]);
    }

    public final float getDrawingStrokeWidth() {
        return ((Number) drawingStrokeWidth$delegate.rl(this, $$delegatedProperties[4])).floatValue();
    }

    public final String getDrawingTool() {
        return (String) drawingTool$delegate.rl(this, $$delegatedProperties[2]);
    }

    public final boolean getEasingOvershoot() {
        return ((Boolean) easingOvershoot$delegate.rl(this, $$delegatedProperties[128])).booleanValue();
    }

    public final int getEffectRecentFavSelectedPos() {
        return ((Number) effectRecentFavSelectedPos$delegate.rl(this, $$delegatedProperties[134])).intValue();
    }

    public final long getElementTabVisitTimestamp() {
        return ((Number) elementTabVisitTimestamp$delegate.rl(this, $$delegatedProperties[118])).longValue();
    }

    public final boolean getEmulatingGLSLMinMaxClamp() {
        return ((Boolean) emulatingGLSLMinMaxClamp$delegate.rl(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getExperimentalEffects() {
        return ((Boolean) experimentalEffects$delegate.rl(this, $$delegatedProperties[101])).booleanValue();
    }

    public final boolean getExperimentalFeatures() {
        return ((Boolean) experimentalFeatures$delegate.rl(this, $$delegatedProperties[102])).booleanValue();
    }

    public final Set<String> getExportedProjectIds() {
        return (Set) exportedProjectIds$delegate.rl(this, $$delegatedProperties[117]);
    }

    public final Set<String> getFavoriteEffects() {
        return (Set) favoriteEffects$delegate.rl(this, $$delegatedProperties[83]);
    }

    public final Set<String> getFavoriteFonts() {
        return (Set) favoriteFonts$delegate.rl(this, $$delegatedProperties[97]);
    }

    public final boolean getFeedIgnorePubDate() {
        return ((Boolean) feedIgnorePubDate$delegate.rl(this, $$delegatedProperties[78])).booleanValue();
    }

    public final String getFirebaseEmulatorAddress() {
        return (String) firebaseEmulatorAddress$delegate.rl(this, $$delegatedProperties[139]);
    }

    public final long getFirstAppExec() {
        return ((Number) firstAppExec$delegate.rl(this, $$delegatedProperties[67])).longValue();
    }

    public final boolean getFontFilterDisplay() {
        return ((Boolean) fontFilterDisplay$delegate.rl(this, $$delegatedProperties[90])).booleanValue();
    }

    public final boolean getFontFilterFavorite() {
        return ((Boolean) fontFilterFavorite$delegate.rl(this, $$delegatedProperties[94])).booleanValue();
    }

    public final boolean getFontFilterHandwriting() {
        return ((Boolean) fontFilterHandwriting$delegate.rl(this, $$delegatedProperties[91])).booleanValue();
    }

    public final boolean getFontFilterImported() {
        return ((Boolean) fontFilterImported$delegate.rl(this, $$delegatedProperties[93])).booleanValue();
    }

    public final boolean getFontFilterMonospace() {
        return ((Boolean) fontFilterMonospace$delegate.rl(this, $$delegatedProperties[92])).booleanValue();
    }

    public final boolean getFontFilterSansSerif() {
        return ((Boolean) fontFilterSansSerif$delegate.rl(this, $$delegatedProperties[89])).booleanValue();
    }

    public final boolean getFontFilterSerif() {
        return ((Boolean) fontFilterSerif$delegate.rl(this, $$delegatedProperties[88])).booleanValue();
    }

    public final int getFontLanguageFilter() {
        return ((Number) fontLanguageFilter$delegate.rl(this, $$delegatedProperties[95])).intValue();
    }

    public final w6 getFontSorting() {
        return (w6) fontSorting$delegate.rl(this, $$delegatedProperties[96]);
    }

    public final boolean getForceFreeTrialEligibility() {
        return ((Boolean) forceFreeTrialEligibility$delegate.rl(this, $$delegatedProperties[155])).booleanValue();
    }

    public final String getGifExportInfo() {
        return (String) gifExportInfo$delegate.rl(this, $$delegatedProperties[109]);
    }

    public final boolean getGrayTheme() {
        return ((Boolean) grayTheme$delegate.rl(this, $$delegatedProperties[6])).booleanValue();
    }

    public final String getIapPopupCheckInfo() {
        return (String) iapPopupCheckInfo$delegate.rl(this, $$delegatedProperties[122]);
    }

    public final I28 getIapPrompt() {
        return (I28) iapPrompt$delegate.rl(this, $$delegatedProperties[124]);
    }

    public final Wre getIapPromptContentTest() {
        return (Wre) iapPromptContentTest$delegate.rl(this, $$delegatedProperties[125]);
    }

    public final CN3 getIapPromptDelay() {
        return (CN3) iapPromptDelay$delegate.rl(this, $$delegatedProperties[123]);
    }

    public final boolean getIapSimulateBadToken() {
        return ((Boolean) iapSimulateBadToken$delegate.rl(this, $$delegatedProperties[64])).booleanValue();
    }

    public final boolean getIaptest() {
        return ((Boolean) iaptest$delegate.rl(this, $$delegatedProperties[33])).booleanValue();
    }

    public final String getImgSeExportInfo() {
        return (String) imgSeExportInfo$delegate.rl(this, $$delegatedProperties[110]);
    }

    public final Set<String> getImportedProjectIds() {
        return (Set) importedProjectIds$delegate.rl(this, $$delegatedProperties[84]);
    }

    public final Set<String> getImportedXmlIds() {
        return (Set) importedXmlIds$delegate.rl(this, $$delegatedProperties[85]);
    }

    public final long getInstallDateTimestamp() {
        return ((Number) installDateTimestamp$delegate.rl(this, $$delegatedProperties[119])).longValue();
    }

    public final Set<String> getInstalledAppVersions() {
        return (Set) installedAppVersions$delegate.rl(this, $$delegatedProperties[86]);
    }

    public final long getLICENSE_CACHE_VERSION() {
        return LICENSE_CACHE_VERSION;
    }

    public final long getLastApkValidation() {
        return ((Number) lastApkValidation$delegate.rl(this, $$delegatedProperties[65])).longValue();
    }

    public final long getLastApkValidationAttempt() {
        return ((Number) lastApkValidationAttempt$delegate.rl(this, $$delegatedProperties[66])).longValue();
    }

    public final long getLastAppExecution() {
        return ((Number) lastAppExecution$delegate.rl(this, $$delegatedProperties[129])).longValue();
    }

    public final String getLastFeedHash() {
        return (String) lastFeedHash$delegate.rl(this, $$delegatedProperties[165]);
    }

    public final int getLastSeenElementCount() {
        return ((Number) lastSeenElementCount$delegate.rl(this, $$delegatedProperties[127])).intValue();
    }

    public final int getLastSeenProjectCount() {
        return ((Number) lastSeenProjectCount$delegate.rl(this, $$delegatedProperties[126])).intValue();
    }

    public final String getLastSerializedFeed() {
        return (String) lastSerializedFeed$delegate.rl(this, $$delegatedProperties[164]);
    }

    public final long getLatestServerTimeMillis() {
        return ((Number) latestServerTimeMillis$delegate.rl(this, $$delegatedProperties[49])).longValue();
    }

    public final long getLicenseCacheVersion() {
        return ((Number) licenseCacheVersion$delegate.rl(this, $$delegatedProperties[45])).longValue();
    }

    public final String getLicenseInfo() {
        return (String) licenseInfo$delegate.rl(this, $$delegatedProperties[46]);
    }

    public final String getLicenseUid() {
        return (String) licenseUid$delegate.rl(this, $$delegatedProperties[47]);
    }

    public final boolean getLiveShapeLockAspect() {
        return ((Boolean) liveShapeLockAspect$delegate.rl(this, $$delegatedProperties[106])).booleanValue();
    }

    public final boolean getLiveShapeSizeFromCenter() {
        return ((Boolean) liveShapeSizeFromCenter$delegate.rl(this, $$delegatedProperties[105])).booleanValue();
    }

    public final boolean getLoopingPlay() {
        return ((Boolean) loopingPlay$delegate.rl(this, $$delegatedProperties[25])).booleanValue();
    }

    public final boolean getLowQualityPreview() {
        return ((Boolean) lowQualityPreview$delegate.rl(this, $$delegatedProperties[87])).booleanValue();
    }

    public final int getMandatoryUpdateVer() {
        return ((Number) mandatoryUpdateVer$delegate.rl(this, $$delegatedProperties[70])).intValue();
    }

    public final int getMaxLayers1080() {
        return ((Number) maxLayers1080$delegate.rl(this, $$delegatedProperties[53])).intValue();
    }

    public final int getMaxLayers1440() {
        return ((Number) maxLayers1440$delegate.rl(this, $$delegatedProperties[54])).intValue();
    }

    public final int getMaxLayers2160() {
        return ((Number) maxLayers2160$delegate.rl(this, $$delegatedProperties[55])).intValue();
    }

    public final int getMaxLayers720() {
        return ((Number) maxLayers720$delegate.rl(this, $$delegatedProperties[52])).intValue();
    }

    public final int getMaxRes() {
        return ((Number) maxRes$delegate.rl(this, $$delegatedProperties[56])).intValue();
    }

    public final int getMaxResWithVideo() {
        return ((Number) maxResWithVideo$delegate.rl(this, $$delegatedProperties[57])).intValue();
    }

    public final int getMediaAccessRequestNumber() {
        return ((Number) mediaAccessRequestNumber$delegate.rl(this, $$delegatedProperties[148])).intValue();
    }

    public final Dsr getMediaBrowserMode() {
        return (Dsr) mediaBrowserMode$delegate.rl(this, $$delegatedProperties[7]);
    }

    public final String getMediaBucketID() {
        return (String) mediaBucketID$delegate.rl(this, $$delegatedProperties[137]);
    }

    public final String getMediaBucketName() {
        return (String) mediaBucketName$delegate.rl(this, $$delegatedProperties[138]);
    }

    public final boolean getMiniColorPickerExpandAlpha() {
        return ((Boolean) miniColorPickerExpandAlpha$delegate.rl(this, $$delegatedProperties[121])).booleanValue();
    }

    public final boolean getMiniMediaBrowserAudioMode() {
        return ((Boolean) miniMediaBrowserAudioMode$delegate.rl(this, $$delegatedProperties[19])).booleanValue();
    }

    public final String getNewProjectAspect() {
        return (String) newProjectAspect$delegate.rl(this, $$delegatedProperties[12]);
    }

    public final n getNewProjectBg() {
        return (n) newProjectBg$delegate.rl(this, $$delegatedProperties[17]);
    }

    public final int getNewProjectCustomHeight() {
        return ((Number) newProjectCustomHeight$delegate.rl(this, $$delegatedProperties[14])).intValue();
    }

    public final boolean getNewProjectCustomSizeLink() {
        return ((Boolean) newProjectCustomSizeLink$delegate.rl(this, $$delegatedProperties[18])).booleanValue();
    }

    public final int getNewProjectCustomWidth() {
        return ((Number) newProjectCustomWidth$delegate.rl(this, $$delegatedProperties[15])).intValue();
    }

    public final int getNewProjectFps() {
        return ((Number) newProjectFps$delegate.rl(this, $$delegatedProperties[16])).intValue();
    }

    public final int getNewProjectRes() {
        return ((Number) newProjectRes$delegate.rl(this, $$delegatedProperties[13])).intValue();
    }

    public final boolean getOnboardingCompletedOrSkipped() {
        return ((Boolean) onboardingCompletedOrSkipped$delegate.rl(this, $$delegatedProperties[28])).booleanValue();
    }

    public final long getOomCount() {
        return ((Number) oomCount$delegate.rl(this, $$delegatedProperties[113])).longValue();
    }

    public final int getPaywallNumber() {
        return ((Number) paywallNumber$delegate.rl(this, $$delegatedProperties[154])).intValue();
    }

    public final boolean getProfilingHud() {
        return ((Boolean) profilingHud$delegate.rl(this, $$delegatedProperties[79])).booleanValue();
    }

    public final Map<String, Long> getProjectEditTime() {
        return projectEditTime$delegate.n(this, $$delegatedProperties[114]);
    }

    public final long getProjectPackageFreeUserMaxDownloadSize() {
        return ((Number) projectPackageFreeUserMaxDownloadSize$delegate.rl(this, $$delegatedProperties[120])).longValue();
    }

    public final int getProjectPresetFps() {
        return ((Number) projectPresetFps$delegate.rl(this, $$delegatedProperties[11])).intValue();
    }

    public final int getProjectPresetRes() {
        return ((Number) projectPresetRes$delegate.rl(this, $$delegatedProperties[10])).intValue();
    }

    public final qz getProjectSortOrder() {
        return (qz) projectSortOrder$delegate.rl(this, $$delegatedProperties[24]);
    }

    public final int getProjectsCreated() {
        return ((Number) projectsCreated$delegate.rl(this, $$delegatedProperties[21])).intValue();
    }

    public final int getProjectsExported() {
        return ((Number) projectsExported$delegate.rl(this, $$delegatedProperties[22])).intValue();
    }

    public final int getProjectsShared() {
        return ((Number) projectsShared$delegate.rl(this, $$delegatedProperties[23])).intValue();
    }

    public final String getRecentMediaSize() {
        return (String) recentMediaSize$delegate.rl(this, $$delegatedProperties[76]);
    }

    public final com.alightcreative.app.motion.persist.w6 getRecentlyUsedAudios() {
        return (com.alightcreative.app.motion.persist.w6) recentlyUsedAudios$delegate.rl(this, $$delegatedProperties[74]);
    }

    public final com.alightcreative.app.motion.persist.w6 getRecentlyUsedEffectTags() {
        return (com.alightcreative.app.motion.persist.w6) recentlyUsedEffectTags$delegate.rl(this, $$delegatedProperties[82]);
    }

    public final com.alightcreative.app.motion.persist.w6 getRecentlyUsedEffects() {
        return (com.alightcreative.app.motion.persist.w6) recentlyUsedEffects$delegate.rl(this, $$delegatedProperties[81]);
    }

    public final com.alightcreative.app.motion.persist.w6 getRecentlyUsedFonts() {
        return (com.alightcreative.app.motion.persist.w6) recentlyUsedFonts$delegate.rl(this, $$delegatedProperties[98]);
    }

    public final com.alightcreative.app.motion.persist.w6 getRecentlyUsedMedia() {
        return (com.alightcreative.app.motion.persist.w6) recentlyUsedMedia$delegate.rl(this, $$delegatedProperties[75]);
    }

    public final C getReviewPopupResponse() {
        return (C) reviewPopupResponse$delegate.rl(this, $$delegatedProperties[104]);
    }

    public final o getSceneBrowserMode() {
        return (o) sceneBrowserMode$delegate.rl(this, $$delegatedProperties[9]);
    }

    public final Map<String, Long> getSeenElementDownloads() {
        return seenElementDownloads$delegate.n(this, $$delegatedProperties[116]);
    }

    public final boolean getSendDeviceIDWithCrashes() {
        return ((Boolean) sendDeviceIDWithCrashes$delegate.rl(this, $$delegatedProperties[30])).booleanValue();
    }

    public final int getSessionNumber() {
        return ((Number) sessionNumber$delegate.rl(this, $$delegatedProperties[147])).intValue();
    }

    public final boolean getShowBookmarkTooltip() {
        return ((Boolean) showBookmarkTooltip$delegate.rl(this, $$delegatedProperties[141])).booleanValue();
    }

    public final boolean getShowMBTooltip() {
        return ((Boolean) showMBTooltip$delegate.rl(this, $$delegatedProperties[142])).booleanValue();
    }

    public final boolean getShowNewFeaturePopup() {
        return ((Boolean) showNewFeaturePopup$delegate.rl(this, $$delegatedProperties[144])).booleanValue();
    }

    public final boolean getShowNewTagForAddTemplateElement() {
        return ((Boolean) showNewTagForAddTemplateElement$delegate.rl(this, $$delegatedProperties[151])).booleanValue();
    }

    public final boolean getShowNewTagForPresetEditButton() {
        return ((Boolean) showNewTagForPresetEditButton$delegate.rl(this, $$delegatedProperties[153])).booleanValue();
    }

    public final boolean getShowNewTagForPresetsSubTab() {
        return ((Boolean) showNewTagForPresetsSubTab$delegate.rl(this, $$delegatedProperties[152])).booleanValue();
    }

    public final boolean getShowNewTagForTemplates() {
        return ((Boolean) showNewTagForTemplates$delegate.rl(this, $$delegatedProperties[150])).booleanValue();
    }

    public final boolean getShowed36EffectBrowserPopup() {
        return ((Boolean) showed36EffectBrowserPopup$delegate.rl(this, $$delegatedProperties[135])).booleanValue();
    }

    public final boolean getShowedLagNotice() {
        return ((Boolean) showedLagNotice$delegate.rl(this, $$delegatedProperties[111])).booleanValue();
    }

    public final long getShowedLagNoticeDate() {
        return ((Number) showedLagNoticeDate$delegate.rl(this, $$delegatedProperties[112])).longValue();
    }

    public final boolean getSimulateUpload() {
        return ((Boolean) simulateUpload$delegate.rl(this, $$delegatedProperties[103])).booleanValue();
    }

    public final String getSkuList() {
        return (String) skuList$delegate.rl(this, $$delegatedProperties[39]);
    }

    public final int getSkuListBuildVersionCode() {
        return ((Number) skuListBuildVersionCode$delegate.rl(this, $$delegatedProperties[43])).intValue();
    }

    public final long getSkuListFetched() {
        return ((Number) skuListFetched$delegate.rl(this, $$delegatedProperties[40])).longValue();
    }

    public final boolean getSkuListNeedsRefresh() {
        return ((Boolean) skuListNeedsRefresh$delegate.rl(this, $$delegatedProperties[41])).booleanValue();
    }

    public final String getSkuListUid() {
        return (String) skuListUid$delegate.rl(this, $$delegatedProperties[42]);
    }

    public final String getSkulist() {
        return (String) skulist$delegate.rl(this, $$delegatedProperties[38]);
    }

    public final String getSpecialEventPopupShown() {
        return (String) specialEventPopupShown$delegate.rl(this, $$delegatedProperties[107]);
    }

    public final boolean getStagingFeed() {
        return ((Boolean) stagingFeed$delegate.rl(this, $$delegatedProperties[63])).booleanValue();
    }

    public final boolean getTestEEA() {
        return ((Boolean) testEEA$delegate.rl(this, $$delegatedProperties[136])).booleanValue();
    }

    public final String getThumbBounds() {
        return (String) thumbBounds$delegate.rl(this, $$delegatedProperties[29]);
    }

    public final int getTimeOffsetSeconds() {
        return ((Number) timeOffsetSeconds$delegate.rl(this, $$delegatedProperties[161])).intValue();
    }

    public final Map<String, Boolean> getTrackProjectEditTime() {
        return trackProjectEditTime$delegate.n(this, $$delegatedProperties[115]);
    }

    public final boolean getTurnedOnCameraView() {
        return ((Boolean) turnedOnCameraView$delegate.rl(this, $$delegatedProperties[143])).booleanValue();
    }

    public final Map<String, Long> getUnfinishedCloudUploadTimestamps() {
        return unfinishedCloudUploadTimestamps$delegate.n(this, $$delegatedProperties[157]);
    }

    public final Set<String> getUnlockedFeatures() {
        return (Set) unlockedFeatures$delegate.rl(this, $$delegatedProperties[145]);
    }

    public final boolean getUpdateSp() {
        return ((Boolean) updateSp$delegate.rl(this, $$delegatedProperties[69])).booleanValue();
    }

    public final boolean getUseFirebaseEmulator() {
        return ((Boolean) useFirebaseEmulator$delegate.rl(this, $$delegatedProperties[140])).booleanValue();
    }

    public final boolean getUseInterstitialVideoTestAds() {
        return ((Boolean) useInterstitialVideoTestAds$delegate.rl(this, $$delegatedProperties[72])).booleanValue();
    }

    public final boolean getUseTestAds() {
        return ((Boolean) useTestAds$delegate.rl(this, $$delegatedProperties[71])).booleanValue();
    }

    public final Set<String> getUsedNewFeatures() {
        return (Set) usedNewFeatures$delegate.rl(this, $$delegatedProperties[146]);
    }

    public final boolean getUserDemoMode() {
        return ((Boolean) userDemoMode$delegate.rl(this, $$delegatedProperties[35])).booleanValue();
    }

    public final Map<String, Long> getVerifiedPurchaseExpirationTime() {
        return verifiedPurchaseExpirationTime$delegate.n(this, $$delegatedProperties[162]);
    }

    public final Map<String, String> getVerifiedPurchaseUid() {
        return verifiedPurchaseUid$delegate.n(this, $$delegatedProperties[163]);
    }

    public final String getVideoExportInfo() {
        return (String) videoExportInfo$delegate.rl(this, $$delegatedProperties[108]);
    }

    public final String getVsalt() {
        return (String) vsalt$delegate.rl(this, $$delegatedProperties[32]);
    }

    public final boolean getWatermark() {
        return ((Boolean) watermark$delegate.rl(this, $$delegatedProperties[20])).booleanValue();
    }

    public final Xo getWmPosition() {
        return (Xo) wmPosition$delegate.rl(this, $$delegatedProperties[131]);
    }

    public final void setAcDevMode(boolean z2) {
        acDevMode$delegate.t(this, $$delegatedProperties[77], Boolean.valueOf(z2));
    }

    public final void setAccountCreated(long j2) {
        accountCreated$delegate.t(this, $$delegatedProperties[48], Long.valueOf(j2));
    }

    public final void setAccountInfoCacheDate(long j2) {
        accountInfoCacheDate$delegate.t(this, $$delegatedProperties[44], Long.valueOf(j2));
    }

    public final void setAcctTestMode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        acctTestMode$delegate.t(this, $$delegatedProperties[36], str);
    }

    public final void setAgreedPrivacy(boolean z2) {
        agreedPrivacy$delegate.t(this, $$delegatedProperties[26], Boolean.valueOf(z2));
    }

    public final void setAgreedPrivacyPolicyVersion(int i2) {
        agreedPrivacyPolicyVersion$delegate.t(this, $$delegatedProperties[27], Integer.valueOf(i2));
    }

    public final void setApkInvalid(boolean z2) {
        apkInvalid$delegate.t(this, $$delegatedProperties[68], Boolean.valueOf(z2));
    }

    public final void setAppDay(int i2) {
        appDay$delegate.t(this, $$delegatedProperties[130], Integer.valueOf(i2));
    }

    public final void setAppInstance(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        appInstance$delegate.t(this, $$delegatedProperties[133], str);
    }

    public final void setAudioBrowserMode(EnumC0648j enumC0648j) {
        Intrinsics.checkNotNullParameter(enumC0648j, "<set-?>");
        audioBrowserMode$delegate.t(this, $$delegatedProperties[8], enumC0648j);
    }

    public final void setAudioResamplerType(Mgn.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        audioResamplerType$delegate.t(this, $$delegatedProperties[132], jVar);
    }

    public final void setColorSelector(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        colorSelector$delegate.t(this, $$delegatedProperties[1], str);
    }

    public final void setColorTab(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        colorTab$delegate.t(this, $$delegatedProperties[73], str);
    }

    public final void setControlpadAccel(boolean z2) {
        controlpadAccel$delegate.t(this, $$delegatedProperties[5], Boolean.valueOf(z2));
    }

    public final void setCountdownDiscountPercent(int i2) {
        countdownDiscountPercent$delegate.t(this, $$delegatedProperties[160], Integer.valueOf(i2));
    }

    public final void setCountdownPaywallStartTime(long j2) {
        countdownPaywallStartTime$delegate.t(this, $$delegatedProperties[159], Long.valueOf(j2));
    }

    public final void setDefaultLayerDuration(int i2) {
        defaultLayerDuration$delegate.t(this, $$delegatedProperties[37], Integer.valueOf(i2));
    }

    public final void setDemoMode(boolean z2) {
        demoMode$delegate.t(this, $$delegatedProperties[34], Boolean.valueOf(z2));
    }

    public final void setDemoModeMediaAndBuckets(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        demoModeMediaAndBuckets$delegate.t(this, $$delegatedProperties[100], set);
    }

    public final void setDeviceCapsAvailableInDb(boolean z2) {
        deviceCapsAvailableInDb$delegate.t(this, $$delegatedProperties[62], Boolean.valueOf(z2));
    }

    public final void setDeviceCapsCheckAttempts(int i2) {
        deviceCapsCheckAttempts$delegate.t(this, $$delegatedProperties[58], Integer.valueOf(i2));
    }

    public final void setDeviceCapsCheckBypassed(boolean z2) {
        deviceCapsCheckBypassed$delegate.t(this, $$delegatedProperties[59], Boolean.valueOf(z2));
    }

    public final void setDeviceCapsCheckProd(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        deviceCapsCheckProd$delegate.t(this, $$delegatedProperties[50], str);
    }

    public final void setDeviceCapsCheckSource(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        deviceCapsCheckSource$delegate.t(this, $$delegatedProperties[61], str);
    }

    public final void setDeviceCapsCheckSuccess(boolean z2) {
        deviceCapsCheckSuccess$delegate.t(this, $$delegatedProperties[60], Boolean.valueOf(z2));
    }

    public final void setDeviceCapsCheckVer(int i2) {
        deviceCapsCheckVer$delegate.t(this, $$delegatedProperties[51], Integer.valueOf(i2));
    }

    public final void setDeviceID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        deviceID$delegate.t(this, $$delegatedProperties[31], str);
    }

    public final void setDisableRenderPerformanceTrace(boolean z2) {
        disableRenderPerformanceTrace$delegate.t(this, $$delegatedProperties[80], Boolean.valueOf(z2));
    }

    public final void setDrawingColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        drawingColor$delegate.t(this, $$delegatedProperties[3], str);
    }

    public final void setDrawingPreview(aC aCVar) {
        Intrinsics.checkNotNullParameter(aCVar, "<set-?>");
        drawingPreview$delegate.t(this, $$delegatedProperties[99], aCVar);
    }

    public final void setDrawingStrokeWidth(float f3) {
        drawingStrokeWidth$delegate.t(this, $$delegatedProperties[4], Float.valueOf(f3));
    }

    public final void setDrawingTool(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        drawingTool$delegate.t(this, $$delegatedProperties[2], str);
    }

    public final void setEasingOvershoot(boolean z2) {
        easingOvershoot$delegate.t(this, $$delegatedProperties[128], Boolean.valueOf(z2));
    }

    public final void setEffectRecentFavSelectedPos(int i2) {
        effectRecentFavSelectedPos$delegate.t(this, $$delegatedProperties[134], Integer.valueOf(i2));
    }

    public final void setElementTabVisitTimestamp(long j2) {
        elementTabVisitTimestamp$delegate.t(this, $$delegatedProperties[118], Long.valueOf(j2));
    }

    public final void setEmulatingGLSLMinMaxClamp(boolean z2) {
        emulatingGLSLMinMaxClamp$delegate.t(this, $$delegatedProperties[0], Boolean.valueOf(z2));
    }

    public final void setExperimentalEffects(boolean z2) {
        experimentalEffects$delegate.t(this, $$delegatedProperties[101], Boolean.valueOf(z2));
    }

    public final void setExperimentalFeatures(boolean z2) {
        experimentalFeatures$delegate.t(this, $$delegatedProperties[102], Boolean.valueOf(z2));
    }

    public final void setExportedProjectIds(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        exportedProjectIds$delegate.t(this, $$delegatedProperties[117], set);
    }

    public final void setFavoriteEffects(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        favoriteEffects$delegate.t(this, $$delegatedProperties[83], set);
    }

    public final void setFavoriteFonts(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        favoriteFonts$delegate.t(this, $$delegatedProperties[97], set);
    }

    public final void setFeedIgnorePubDate(boolean z2) {
        feedIgnorePubDate$delegate.t(this, $$delegatedProperties[78], Boolean.valueOf(z2));
    }

    public final void setFirebaseEmulatorAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        firebaseEmulatorAddress$delegate.t(this, $$delegatedProperties[139], str);
    }

    public final void setFirstAppExec(long j2) {
        firstAppExec$delegate.t(this, $$delegatedProperties[67], Long.valueOf(j2));
    }

    public final void setFontFilterDisplay(boolean z2) {
        fontFilterDisplay$delegate.t(this, $$delegatedProperties[90], Boolean.valueOf(z2));
    }

    public final void setFontFilterFavorite(boolean z2) {
        fontFilterFavorite$delegate.t(this, $$delegatedProperties[94], Boolean.valueOf(z2));
    }

    public final void setFontFilterHandwriting(boolean z2) {
        fontFilterHandwriting$delegate.t(this, $$delegatedProperties[91], Boolean.valueOf(z2));
    }

    public final void setFontFilterImported(boolean z2) {
        fontFilterImported$delegate.t(this, $$delegatedProperties[93], Boolean.valueOf(z2));
    }

    public final void setFontFilterMonospace(boolean z2) {
        fontFilterMonospace$delegate.t(this, $$delegatedProperties[92], Boolean.valueOf(z2));
    }

    public final void setFontFilterSansSerif(boolean z2) {
        fontFilterSansSerif$delegate.t(this, $$delegatedProperties[89], Boolean.valueOf(z2));
    }

    public final void setFontFilterSerif(boolean z2) {
        fontFilterSerif$delegate.t(this, $$delegatedProperties[88], Boolean.valueOf(z2));
    }

    public final void setFontLanguageFilter(int i2) {
        fontLanguageFilter$delegate.t(this, $$delegatedProperties[95], Integer.valueOf(i2));
    }

    public final void setFontSorting(w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<set-?>");
        fontSorting$delegate.t(this, $$delegatedProperties[96], w6Var);
    }

    public final void setForceFreeTrialEligibility(boolean z2) {
        forceFreeTrialEligibility$delegate.t(this, $$delegatedProperties[155], Boolean.valueOf(z2));
    }

    public final void setGifExportInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        gifExportInfo$delegate.t(this, $$delegatedProperties[109], str);
    }

    public final void setGrayTheme(boolean z2) {
        grayTheme$delegate.t(this, $$delegatedProperties[6], Boolean.valueOf(z2));
    }

    public final void setIapPopupCheckInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        iapPopupCheckInfo$delegate.t(this, $$delegatedProperties[122], str);
    }

    public final void setIapSimulateBadToken(boolean z2) {
        iapSimulateBadToken$delegate.t(this, $$delegatedProperties[64], Boolean.valueOf(z2));
    }

    public final void setIaptest(boolean z2) {
        iaptest$delegate.t(this, $$delegatedProperties[33], Boolean.valueOf(z2));
    }

    public final void setImgSeExportInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        imgSeExportInfo$delegate.t(this, $$delegatedProperties[110], str);
    }

    public final void setImportedProjectIds(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        importedProjectIds$delegate.t(this, $$delegatedProperties[84], set);
    }

    public final void setImportedXmlIds(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        importedXmlIds$delegate.t(this, $$delegatedProperties[85], set);
    }

    public final void setInstallDateTimestamp(long j2) {
        installDateTimestamp$delegate.t(this, $$delegatedProperties[119], Long.valueOf(j2));
    }

    public final void setInstalledAppVersions(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        installedAppVersions$delegate.t(this, $$delegatedProperties[86], set);
    }

    public final void setLastApkValidation(long j2) {
        lastApkValidation$delegate.t(this, $$delegatedProperties[65], Long.valueOf(j2));
    }

    public final void setLastApkValidationAttempt(long j2) {
        lastApkValidationAttempt$delegate.t(this, $$delegatedProperties[66], Long.valueOf(j2));
    }

    public final void setLastAppExecution(long j2) {
        lastAppExecution$delegate.t(this, $$delegatedProperties[129], Long.valueOf(j2));
    }

    public final void setLastFeedHash(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        lastFeedHash$delegate.t(this, $$delegatedProperties[165], str);
    }

    public final void setLastSeenElementCount(int i2) {
        lastSeenElementCount$delegate.t(this, $$delegatedProperties[127], Integer.valueOf(i2));
    }

    public final void setLastSeenProjectCount(int i2) {
        lastSeenProjectCount$delegate.t(this, $$delegatedProperties[126], Integer.valueOf(i2));
    }

    public final void setLastSerializedFeed(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        lastSerializedFeed$delegate.t(this, $$delegatedProperties[164], str);
    }

    public final void setLatestServerTimeMillis(long j2) {
        latestServerTimeMillis$delegate.t(this, $$delegatedProperties[49], Long.valueOf(j2));
    }

    public final void setLicenseCacheVersion(long j2) {
        licenseCacheVersion$delegate.t(this, $$delegatedProperties[45], Long.valueOf(j2));
    }

    public final void setLicenseInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        licenseInfo$delegate.t(this, $$delegatedProperties[46], str);
    }

    public final void setLicenseUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        licenseUid$delegate.t(this, $$delegatedProperties[47], str);
    }

    public final void setLiveShapeLockAspect(boolean z2) {
        liveShapeLockAspect$delegate.t(this, $$delegatedProperties[106], Boolean.valueOf(z2));
    }

    public final void setLiveShapeSizeFromCenter(boolean z2) {
        liveShapeSizeFromCenter$delegate.t(this, $$delegatedProperties[105], Boolean.valueOf(z2));
    }

    public final void setLoopingPlay(boolean z2) {
        loopingPlay$delegate.t(this, $$delegatedProperties[25], Boolean.valueOf(z2));
    }

    public final void setLowQualityPreview(boolean z2) {
        lowQualityPreview$delegate.t(this, $$delegatedProperties[87], Boolean.valueOf(z2));
    }

    public final void setMandatoryUpdateVer(int i2) {
        mandatoryUpdateVer$delegate.t(this, $$delegatedProperties[70], Integer.valueOf(i2));
    }

    public final void setMaxLayers1080(int i2) {
        maxLayers1080$delegate.t(this, $$delegatedProperties[53], Integer.valueOf(i2));
    }

    public final void setMaxLayers1440(int i2) {
        maxLayers1440$delegate.t(this, $$delegatedProperties[54], Integer.valueOf(i2));
    }

    public final void setMaxLayers2160(int i2) {
        maxLayers2160$delegate.t(this, $$delegatedProperties[55], Integer.valueOf(i2));
    }

    public final void setMaxLayers720(int i2) {
        maxLayers720$delegate.t(this, $$delegatedProperties[52], Integer.valueOf(i2));
    }

    public final void setMaxRes(int i2) {
        maxRes$delegate.t(this, $$delegatedProperties[56], Integer.valueOf(i2));
    }

    public final void setMaxResWithVideo(int i2) {
        maxResWithVideo$delegate.t(this, $$delegatedProperties[57], Integer.valueOf(i2));
    }

    public final void setMediaAccessRequestNumber(int i2) {
        mediaAccessRequestNumber$delegate.t(this, $$delegatedProperties[148], Integer.valueOf(i2));
    }

    public final void setMediaBrowserMode(Dsr dsr) {
        Intrinsics.checkNotNullParameter(dsr, "<set-?>");
        mediaBrowserMode$delegate.t(this, $$delegatedProperties[7], dsr);
    }

    public final void setMediaBucketID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        mediaBucketID$delegate.t(this, $$delegatedProperties[137], str);
    }

    public final void setMediaBucketName(String str) {
        Intrinsics.checkNotNullParameter(str, jhotmBbwMbr.JmDYb);
        mediaBucketName$delegate.t(this, $$delegatedProperties[138], str);
    }

    public final void setMiniColorPickerExpandAlpha(boolean z2) {
        miniColorPickerExpandAlpha$delegate.t(this, $$delegatedProperties[121], Boolean.valueOf(z2));
    }

    public final void setMiniMediaBrowserAudioMode(boolean z2) {
        miniMediaBrowserAudioMode$delegate.t(this, $$delegatedProperties[19], Boolean.valueOf(z2));
    }

    public final void setNewProjectAspect(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        newProjectAspect$delegate.t(this, $$delegatedProperties[12], str);
    }

    public final void setNewProjectBg(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        newProjectBg$delegate.t(this, $$delegatedProperties[17], nVar);
    }

    public final void setNewProjectCustomHeight(int i2) {
        newProjectCustomHeight$delegate.t(this, $$delegatedProperties[14], Integer.valueOf(i2));
    }

    public final void setNewProjectCustomSizeLink(boolean z2) {
        newProjectCustomSizeLink$delegate.t(this, $$delegatedProperties[18], Boolean.valueOf(z2));
    }

    public final void setNewProjectCustomWidth(int i2) {
        newProjectCustomWidth$delegate.t(this, $$delegatedProperties[15], Integer.valueOf(i2));
    }

    public final void setNewProjectFps(int i2) {
        newProjectFps$delegate.t(this, $$delegatedProperties[16], Integer.valueOf(i2));
    }

    public final void setNewProjectRes(int i2) {
        newProjectRes$delegate.t(this, $$delegatedProperties[13], Integer.valueOf(i2));
    }

    public final void setOnboardingCompletedOrSkipped(boolean z2) {
        onboardingCompletedOrSkipped$delegate.t(this, $$delegatedProperties[28], Boolean.valueOf(z2));
    }

    public final void setOomCount(long j2) {
        oomCount$delegate.t(this, $$delegatedProperties[113], Long.valueOf(j2));
    }

    public final void setPaywallNumber(int i2) {
        paywallNumber$delegate.t(this, $$delegatedProperties[154], Integer.valueOf(i2));
    }

    public final void setProfilingHud(boolean z2) {
        profilingHud$delegate.t(this, $$delegatedProperties[79], Boolean.valueOf(z2));
    }

    public final void setProjectPackageFreeUserMaxDownloadSize(long j2) {
        projectPackageFreeUserMaxDownloadSize$delegate.t(this, $$delegatedProperties[120], Long.valueOf(j2));
    }

    public final void setProjectPresetFps(int i2) {
        projectPresetFps$delegate.t(this, $$delegatedProperties[11], Integer.valueOf(i2));
    }

    public final void setProjectPresetRes(int i2) {
        projectPresetRes$delegate.t(this, $$delegatedProperties[10], Integer.valueOf(i2));
    }

    public final void setProjectSortOrder(qz qzVar) {
        Intrinsics.checkNotNullParameter(qzVar, "<set-?>");
        projectSortOrder$delegate.t(this, $$delegatedProperties[24], qzVar);
    }

    public final void setProjectsCreated(int i2) {
        projectsCreated$delegate.t(this, $$delegatedProperties[21], Integer.valueOf(i2));
    }

    public final void setProjectsExported(int i2) {
        projectsExported$delegate.t(this, $$delegatedProperties[22], Integer.valueOf(i2));
    }

    public final void setProjectsShared(int i2) {
        projectsShared$delegate.t(this, $$delegatedProperties[23], Integer.valueOf(i2));
    }

    public final void setRecentMediaSize(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        recentMediaSize$delegate.t(this, $$delegatedProperties[76], str);
    }

    public final void setRecentlyUsedAudios(com.alightcreative.app.motion.persist.w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<set-?>");
        recentlyUsedAudios$delegate.t(this, $$delegatedProperties[74], w6Var);
    }

    public final void setRecentlyUsedEffectTags(com.alightcreative.app.motion.persist.w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<set-?>");
        recentlyUsedEffectTags$delegate.t(this, $$delegatedProperties[82], w6Var);
    }

    public final void setRecentlyUsedEffects(com.alightcreative.app.motion.persist.w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<set-?>");
        recentlyUsedEffects$delegate.t(this, $$delegatedProperties[81], w6Var);
    }

    public final void setRecentlyUsedFonts(com.alightcreative.app.motion.persist.w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<set-?>");
        recentlyUsedFonts$delegate.t(this, $$delegatedProperties[98], w6Var);
    }

    public final void setRecentlyUsedMedia(com.alightcreative.app.motion.persist.w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<set-?>");
        recentlyUsedMedia$delegate.t(this, $$delegatedProperties[75], w6Var);
    }

    public final void setReviewPopupResponse(C c2) {
        Intrinsics.checkNotNullParameter(c2, "<set-?>");
        reviewPopupResponse$delegate.t(this, $$delegatedProperties[104], c2);
    }

    public final void setSceneBrowserMode(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<set-?>");
        sceneBrowserMode$delegate.t(this, $$delegatedProperties[9], oVar);
    }

    public final void setSendDeviceIDWithCrashes(boolean z2) {
        sendDeviceIDWithCrashes$delegate.t(this, $$delegatedProperties[30], Boolean.valueOf(z2));
    }

    public final void setSessionNumber(int i2) {
        sessionNumber$delegate.t(this, $$delegatedProperties[147], Integer.valueOf(i2));
    }

    public final void setShowBookmarkTooltip(boolean z2) {
        showBookmarkTooltip$delegate.t(this, $$delegatedProperties[141], Boolean.valueOf(z2));
    }

    public final void setShowMBTooltip(boolean z2) {
        showMBTooltip$delegate.t(this, $$delegatedProperties[142], Boolean.valueOf(z2));
    }

    public final void setShowNewFeaturePopup(boolean z2) {
        showNewFeaturePopup$delegate.t(this, $$delegatedProperties[144], Boolean.valueOf(z2));
    }

    public final void setShowNewTagForAddTemplateElement(boolean z2) {
        showNewTagForAddTemplateElement$delegate.t(this, $$delegatedProperties[151], Boolean.valueOf(z2));
    }

    public final void setShowNewTagForPresetEditButton(boolean z2) {
        showNewTagForPresetEditButton$delegate.t(this, $$delegatedProperties[153], Boolean.valueOf(z2));
    }

    public final void setShowNewTagForPresetsSubTab(boolean z2) {
        showNewTagForPresetsSubTab$delegate.t(this, $$delegatedProperties[152], Boolean.valueOf(z2));
    }

    public final void setShowNewTagForTemplates(boolean z2) {
        showNewTagForTemplates$delegate.t(this, $$delegatedProperties[150], Boolean.valueOf(z2));
    }

    public final void setShowed36EffectBrowserPopup(boolean z2) {
        showed36EffectBrowserPopup$delegate.t(this, $$delegatedProperties[135], Boolean.valueOf(z2));
    }

    public final void setShowedLagNotice(boolean z2) {
        showedLagNotice$delegate.t(this, $$delegatedProperties[111], Boolean.valueOf(z2));
    }

    public final void setShowedLagNoticeDate(long j2) {
        showedLagNoticeDate$delegate.t(this, $$delegatedProperties[112], Long.valueOf(j2));
    }

    public final void setSimulateUpload(boolean z2) {
        simulateUpload$delegate.t(this, $$delegatedProperties[103], Boolean.valueOf(z2));
    }

    public final void setSkuList(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        skuList$delegate.t(this, $$delegatedProperties[39], str);
    }

    public final void setSkuListBuildVersionCode(int i2) {
        skuListBuildVersionCode$delegate.t(this, $$delegatedProperties[43], Integer.valueOf(i2));
    }

    public final void setSkuListFetched(long j2) {
        skuListFetched$delegate.t(this, $$delegatedProperties[40], Long.valueOf(j2));
    }

    public final void setSkuListNeedsRefresh(boolean z2) {
        skuListNeedsRefresh$delegate.t(this, $$delegatedProperties[41], Boolean.valueOf(z2));
    }

    public final void setSkuListUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        skuListUid$delegate.t(this, $$delegatedProperties[42], str);
    }

    public final void setSkulist(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        skulist$delegate.t(this, $$delegatedProperties[38], str);
    }

    public final void setSpecialEventPopupShown(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        specialEventPopupShown$delegate.t(this, $$delegatedProperties[107], str);
    }

    public final void setStagingFeed(boolean z2) {
        stagingFeed$delegate.t(this, $$delegatedProperties[63], Boolean.valueOf(z2));
    }

    public final void setTestEEA(boolean z2) {
        testEEA$delegate.t(this, $$delegatedProperties[136], Boolean.valueOf(z2));
    }

    public final void setTimeOffsetSeconds(int i2) {
        timeOffsetSeconds$delegate.t(this, $$delegatedProperties[161], Integer.valueOf(i2));
    }

    public final void setTurnedOnCameraView(boolean z2) {
        turnedOnCameraView$delegate.t(this, $$delegatedProperties[143], Boolean.valueOf(z2));
    }

    public final void setUnlockedFeatures(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        unlockedFeatures$delegate.t(this, $$delegatedProperties[145], set);
    }

    public final void setUpdateSp(boolean z2) {
        updateSp$delegate.t(this, $$delegatedProperties[69], Boolean.valueOf(z2));
    }

    public final void setUseFirebaseEmulator(boolean z2) {
        useFirebaseEmulator$delegate.t(this, $$delegatedProperties[140], Boolean.valueOf(z2));
    }

    public final void setUseInterstitialVideoTestAds(boolean z2) {
        useInterstitialVideoTestAds$delegate.t(this, $$delegatedProperties[72], Boolean.valueOf(z2));
    }

    public final void setUseTestAds(boolean z2) {
        useTestAds$delegate.t(this, $$delegatedProperties[71], Boolean.valueOf(z2));
    }

    public final void setUsedNewFeatures(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        usedNewFeatures$delegate.t(this, $$delegatedProperties[146], set);
    }

    public final void setUserDemoMode(boolean z2) {
        userDemoMode$delegate.t(this, $$delegatedProperties[35], Boolean.valueOf(z2));
    }

    public final void setVideoExportInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        videoExportInfo$delegate.t(this, $$delegatedProperties[108], str);
    }

    public final void setVsalt(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        vsalt$delegate.t(this, $$delegatedProperties[32], str);
    }

    public final void setWatermark(boolean z2) {
        watermark$delegate.t(this, $$delegatedProperties[20], Boolean.valueOf(z2));
    }

    public final void setWmPosition(Xo xo) {
        Intrinsics.checkNotNullParameter(xo, "<set-?>");
        wmPosition$delegate.t(this, $$delegatedProperties[131], xo);
    }

    private j() {
    }

    public final boolean getNewInstall() {
        if (!getInstalledAppVersions().isEmpty() && !Intrinsics.areEqual(CollectionsKt.singleOrNull(getInstalledAppVersions()), "5.0.273.1028425")) {
            return false;
        }
        return true;
    }

    public final boolean isFirstMediaAccessRequest() {
        if (getMediaAccessRequestNumber() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isFirstPaywall() {
        if (getPaywallNumber() == 1 && isFirstSession()) {
            return true;
        }
        return false;
    }

    public final boolean isFirstSession() {
        if (getSessionNumber() == 1) {
            return true;
        }
        return false;
    }
}
