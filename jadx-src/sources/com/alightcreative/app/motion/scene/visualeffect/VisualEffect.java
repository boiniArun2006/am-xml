package com.alightcreative.app.motion.scene.visualeffect;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.alightcreative.app.motion.scene.scripting.ACScript;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.RedirectEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import yc.S;
import yc.V;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010'\u001a\u00020\f\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010)\u001a\u00020\u0017\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010,\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u00100J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u00100J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b5\u00106J\u001c\u00107\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0003¢\u0006\u0004\b7\u00108J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006HÆ\u0003¢\u0006\u0004\b9\u00104J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006HÆ\u0003¢\u0006\u0004\b:\u00104J\u0010\u0010;\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bA\u0010@J\u0010\u0010B\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bB\u0010@J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006HÆ\u0003¢\u0006\u0004\bC\u00104J\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u00100J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006HÆ\u0003¢\u0006\u0004\bE\u00104J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020!0 HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020#0\u0006HÆ\u0003¢\u0006\u0004\bH\u00104J\u0012\u0010I\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bI\u0010<J\u0012\u0010J\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bJ\u0010<J\u0010\u0010K\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u00100J\u0010\u0010N\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bN\u0010@J\u0010\u0010O\u001a\u00020*HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bQ\u0010@JÆ\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00022\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010'\u001a\u00020\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010)\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bT\u00100J\u0010\u0010U\u001a\u00020\fHÖ\u0001¢\u0006\u0004\bU\u0010LJ\u001a\u0010X\u001a\u00020\u00172\b\u0010W\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bX\u0010YR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Z\u001a\u0004\b[\u00100R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010Z\u001a\u0004\b\\\u00100R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010Z\u001a\u0004\b]\u00100R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010^\u001a\u0004\b_\u00104R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010`\u001a\u0004\ba\u00106R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010b\u001a\u0004\bc\u00108R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010^\u001a\u0004\bd\u00104R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010^\u001a\u0004\be\u00104R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010f\u001a\u0004\bg\u0010<R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010h\u001a\u0004\bi\u0010>R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010j\u001a\u0004\bk\u0010@R\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010j\u001a\u0004\bl\u0010@R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010j\u001a\u0004\bm\u0010@R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010^\u001a\u0004\bn\u00104R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010Z\u001a\u0004\bo\u00100R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010^\u001a\u0004\bp\u00104R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010q\u001a\u0004\br\u0010GR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00068\u0006¢\u0006\f\n\u0004\b$\u0010^\u001a\u0004\bs\u00104R\u0019\u0010%\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b%\u0010f\u001a\u0004\bt\u0010<R\u0019\u0010&\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b&\u0010f\u001a\u0004\bu\u0010<R\u0017\u0010'\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010v\u001a\u0004\bw\u0010LR\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010Z\u001a\u0004\bx\u00100R\u0017\u0010)\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b)\u0010j\u001a\u0004\by\u0010@R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010z\u001a\u0004\b{\u0010PR\u0017\u0010,\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b,\u0010j\u001a\u0004\b|\u0010@R(\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b}\u0010~\u001a\u0004\b\u007f\u00108¨\u0006\u0081\u0001"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "Lcom/alightcreative/app/motion/scene/visualeffect/OptionalVisualEffect;", "", "id", AppMeasurementSdk.ConditionalUserProperty.NAME, "desc", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", "parameters", "LIy/n;", "localizedStrings", "", "", "Lcom/alightcreative/app/motion/scene/visualeffect/ShaderGroup;", "shaderGroups", "Lcom/alightcreative/app/motion/scene/scripting/ACScript;", "scripts", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectRenderPass;", "passes", "Landroid/net/Uri;", "uri", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectType;", "type", "", RedirectEvent.f62801i, "deprecated", "experimental", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectPreset;", "packagedPresets", "categoryId", "Lyc/V;", "tags", "", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity;", "affinity", "Lyc/S;", "categories", "thumbnail", "backgroundImage", "iterCount", "iterParam", "hasOverdaw", "", "maxOverdraw", "autoTransform", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LIy/n;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Landroid/net/Uri;Lcom/alightcreative/app/motion/scene/visualeffect/EffectType;ZZZLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/List;Landroid/net/Uri;Landroid/net/Uri;ILjava/lang/String;ZFZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()LIy/n;", "component6", "()Ljava/util/Map;", "component7", "component8", "component9", "()Landroid/net/Uri;", "component10", "()Lcom/alightcreative/app/motion/scene/visualeffect/EffectType;", "component11", "()Z", "component12", "component13", "component14", "component15", "component16", "component17", "()Ljava/util/Set;", "component18", "component19", "component20", "component21", "()I", "component22", "component23", "component24", "()F", "component25", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LIy/n;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Landroid/net/Uri;Lcom/alightcreative/app/motion/scene/visualeffect/EffectType;ZZZLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/List;Landroid/net/Uri;Landroid/net/Uri;ILjava/lang/String;ZFZ)Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "toString", "hashCode", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getDesc", "Ljava/util/List;", "getParameters", "LIy/n;", "getLocalizedStrings", "Ljava/util/Map;", "getShaderGroups", "getScripts", "getPasses", "Landroid/net/Uri;", "getUri", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectType;", "getType", "Z", "getInternal", "getDeprecated", "getExperimental", "getPackagedPresets", "getCategoryId", "getTags", "Ljava/util/Set;", "getAffinity", "getCategories", "getThumbnail", "getBackgroundImage", "I", "getIterCount", "getIterParam", "getHasOverdaw", "F", "getMaxOverdraw", "getAutoTransform", "paramsById$delegate", "Lkotlin/Lazy;", "getParamsById", "paramsById", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVisualEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisualEffect.kt\ncom/alightcreative/app/motion/scene/visualeffect/VisualEffect\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,777:1\n1202#2,2:778\n1230#2,4:780\n*S KotlinDebug\n*F\n+ 1 VisualEffect.kt\ncom/alightcreative/app/motion/scene/visualeffect/VisualEffect\n*L\n183#1:778,2\n183#1:780,4\n*E\n"})
public final /* data */ class VisualEffect extends OptionalVisualEffect {
    public static final int $stable = 8;
    private final Set<EffectAffinity> affinity;
    private final boolean autoTransform;
    private final Uri backgroundImage;
    private final List<S> categories;
    private final String categoryId;
    private final boolean deprecated;
    private final String desc;
    private final boolean experimental;
    private final boolean hasOverdaw;
    private final String id;
    private final boolean internal;
    private final int iterCount;
    private final String iterParam;
    private final Iy.n localizedStrings;
    private final float maxOverdraw;
    private final String name;
    private final List<EffectPreset> packagedPresets;
    private final List<UserParameter> parameters;

    /* JADX INFO: renamed from: paramsById$delegate, reason: from kotlin metadata */
    private final Lazy paramsById;
    private final List<EffectRenderPass> passes;
    private final List<ACScript> scripts;
    private final Map<Integer, ShaderGroup> shaderGroups;
    private final List<V> tags;
    private final Uri thumbnail;
    private final EffectType type;
    private final Uri uri;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisualEffect copy$default(VisualEffect visualEffect, String str, String str2, String str3, List list, Iy.n nVar, Map map, List list2, List list3, Uri uri, EffectType effectType, boolean z2, boolean z3, boolean z4, List list4, String str4, List list5, Set set, List list6, Uri uri2, Uri uri3, int i2, String str5, boolean z5, float f3, boolean z6, int i3, Object obj) {
        boolean z7;
        float f4;
        String str6 = (i3 & 1) != 0 ? visualEffect.id : str;
        String str7 = (i3 & 2) != 0 ? visualEffect.name : str2;
        String str8 = (i3 & 4) != 0 ? visualEffect.desc : str3;
        List list7 = (i3 & 8) != 0 ? visualEffect.parameters : list;
        Iy.n nVar2 = (i3 & 16) != 0 ? visualEffect.localizedStrings : nVar;
        Map map2 = (i3 & 32) != 0 ? visualEffect.shaderGroups : map;
        List list8 = (i3 & 64) != 0 ? visualEffect.scripts : list2;
        List list9 = (i3 & 128) != 0 ? visualEffect.passes : list3;
        Uri uri4 = (i3 & 256) != 0 ? visualEffect.uri : uri;
        EffectType effectType2 = (i3 & 512) != 0 ? visualEffect.type : effectType;
        boolean z9 = (i3 & 1024) != 0 ? visualEffect.internal : z2;
        boolean z10 = (i3 & 2048) != 0 ? visualEffect.deprecated : z3;
        boolean z11 = (i3 & 4096) != 0 ? visualEffect.experimental : z4;
        List list10 = (i3 & 8192) != 0 ? visualEffect.packagedPresets : list4;
        String str9 = str6;
        String str10 = (i3 & 16384) != 0 ? visualEffect.categoryId : str4;
        List list11 = (i3 & 32768) != 0 ? visualEffect.tags : list5;
        Set set2 = (i3 & 65536) != 0 ? visualEffect.affinity : set;
        List list12 = (i3 & 131072) != 0 ? visualEffect.categories : list6;
        Uri uri5 = (i3 & 262144) != 0 ? visualEffect.thumbnail : uri2;
        Uri uri6 = (i3 & 524288) != 0 ? visualEffect.backgroundImage : uri3;
        int i5 = (i3 & 1048576) != 0 ? visualEffect.iterCount : i2;
        String str11 = (i3 & 2097152) != 0 ? visualEffect.iterParam : str5;
        boolean z12 = (i3 & 4194304) != 0 ? visualEffect.hasOverdaw : z5;
        float f5 = (i3 & 8388608) != 0 ? visualEffect.maxOverdraw : f3;
        if ((i3 & 16777216) != 0) {
            f4 = f5;
            z7 = visualEffect.autoTransform;
        } else {
            z7 = z6;
            f4 = f5;
        }
        return visualEffect.copy(str9, str7, str8, list7, nVar2, map2, list8, list9, uri4, effectType2, z9, z10, z11, list10, str10, list11, set2, list12, uri5, uri6, i5, str11, z12, f4, z7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final EffectType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getInternal() {
        return this.internal;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getDeprecated() {
        return this.deprecated;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getExperimental() {
        return this.experimental;
    }

    public final List<EffectPreset> component14() {
        return this.packagedPresets;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    public final List<V> component16() {
        return this.tags;
    }

    public final Set<EffectAffinity> component17() {
        return this.affinity;
    }

    public final List<S> component18() {
        return this.categories;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Uri getThumbnail() {
        return this.thumbnail;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Uri getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getIterCount() {
        return this.iterCount;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getIterParam() {
        return this.iterParam;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getHasOverdaw() {
        return this.hasOverdaw;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final float getMaxOverdraw() {
        return this.maxOverdraw;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getAutoTransform() {
        return this.autoTransform;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    public final List<UserParameter> component4() {
        return this.parameters;
    }

    public final Map<Integer, ShaderGroup> component6() {
        return this.shaderGroups;
    }

    public final List<ACScript> component7() {
        return this.scripts;
    }

    public final List<EffectRenderPass> component8() {
        return this.passes;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisualEffect)) {
            return false;
        }
        VisualEffect visualEffect = (VisualEffect) other;
        return Intrinsics.areEqual(this.id, visualEffect.id) && Intrinsics.areEqual(this.name, visualEffect.name) && Intrinsics.areEqual(this.desc, visualEffect.desc) && Intrinsics.areEqual(this.parameters, visualEffect.parameters) && Intrinsics.areEqual(this.localizedStrings, visualEffect.localizedStrings) && Intrinsics.areEqual(this.shaderGroups, visualEffect.shaderGroups) && Intrinsics.areEqual(this.scripts, visualEffect.scripts) && Intrinsics.areEqual(this.passes, visualEffect.passes) && Intrinsics.areEqual(this.uri, visualEffect.uri) && this.type == visualEffect.type && this.internal == visualEffect.internal && this.deprecated == visualEffect.deprecated && this.experimental == visualEffect.experimental && Intrinsics.areEqual(this.packagedPresets, visualEffect.packagedPresets) && Intrinsics.areEqual(this.categoryId, visualEffect.categoryId) && Intrinsics.areEqual(this.tags, visualEffect.tags) && Intrinsics.areEqual(this.affinity, visualEffect.affinity) && Intrinsics.areEqual(this.categories, visualEffect.categories) && Intrinsics.areEqual(this.thumbnail, visualEffect.thumbnail) && Intrinsics.areEqual(this.backgroundImage, visualEffect.backgroundImage) && this.iterCount == visualEffect.iterCount && Intrinsics.areEqual(this.iterParam, visualEffect.iterParam) && this.hasOverdaw == visualEffect.hasOverdaw && Float.compare(this.maxOverdraw, visualEffect.maxOverdraw) == 0 && this.autoTransform == visualEffect.autoTransform;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.localizedStrings.hashCode()) * 31) + this.shaderGroups.hashCode()) * 31) + this.scripts.hashCode()) * 31) + this.passes.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.internal)) * 31) + Boolean.hashCode(this.deprecated)) * 31) + Boolean.hashCode(this.experimental)) * 31) + this.packagedPresets.hashCode()) * 31) + this.categoryId.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.affinity.hashCode()) * 31) + this.categories.hashCode()) * 31;
        Uri uri = this.thumbnail;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.backgroundImage;
        int iHashCode3 = (((iHashCode2 + (uri2 == null ? 0 : uri2.hashCode())) * 31) + Integer.hashCode(this.iterCount)) * 31;
        String str = this.iterParam;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasOverdaw)) * 31) + Float.hashCode(this.maxOverdraw)) * 31) + Boolean.hashCode(this.autoTransform);
    }

    public String toString() {
        return "VisualEffect(id=" + this.id + ", name=" + this.name + ", desc=" + this.desc + ", parameters=" + this.parameters + ", localizedStrings=" + this.localizedStrings + ", shaderGroups=" + this.shaderGroups + ", scripts=" + this.scripts + ", passes=" + this.passes + ", uri=" + this.uri + ", type=" + this.type + ", internal=" + this.internal + ", deprecated=" + this.deprecated + ", experimental=" + this.experimental + ", packagedPresets=" + this.packagedPresets + ", categoryId=" + this.categoryId + ", tags=" + this.tags + ", affinity=" + this.affinity + ", categories=" + this.categories + ", thumbnail=" + this.thumbnail + ", backgroundImage=" + this.backgroundImage + ", iterCount=" + this.iterCount + ", iterParam=" + this.iterParam + ", hasOverdaw=" + this.hasOverdaw + ", maxOverdraw=" + this.maxOverdraw + ", autoTransform=" + this.autoTransform + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VisualEffect(String id, String name, String desc, List<? extends UserParameter> parameters, Iy.n localizedStrings, Map<Integer, ShaderGroup> shaderGroups, List<ACScript> scripts, List<EffectRenderPass> passes, Uri uri, EffectType type, boolean z2, boolean z3, boolean z4, List<EffectPreset> list, String categoryId, List<? extends V> tags, Set<EffectAffinity> affinity, List<S> categories, Uri uri2, Uri uri3, int i2, String str, boolean z5, float f3, boolean z6) {
        super(null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(localizedStrings, "localizedStrings");
        Intrinsics.checkNotNullParameter(shaderGroups, "shaderGroups");
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(passes, "passes");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(list, qfEYuUHwj.oJc);
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(affinity, "affinity");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.parameters = parameters;
        this.localizedStrings = localizedStrings;
        this.shaderGroups = shaderGroups;
        this.scripts = scripts;
        this.passes = passes;
        this.uri = uri;
        this.type = type;
        this.internal = z2;
        this.deprecated = z3;
        this.experimental = z4;
        this.packagedPresets = list;
        this.categoryId = categoryId;
        this.tags = tags;
        this.affinity = affinity;
        this.categories = categories;
        this.thumbnail = uri2;
        this.backgroundImage = uri3;
        this.iterCount = i2;
        this.iterParam = str;
        this.hasOverdaw = z5;
        this.maxOverdraw = f3;
        this.autoTransform = z6;
        this.paramsById = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VisualEffect.paramsById_delegate$lambda$1(this.f46371n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map paramsById_delegate$lambda$1(VisualEffect visualEffect) {
        List<UserParameter> list = visualEffect.parameters;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((UserParameter) obj).getName(), obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Iy.n getLocalizedStrings() {
        return this.localizedStrings;
    }

    public final VisualEffect copy(String id, String name, String desc, List<? extends UserParameter> parameters, Iy.n localizedStrings, Map<Integer, ShaderGroup> shaderGroups, List<ACScript> scripts, List<EffectRenderPass> passes, Uri uri, EffectType type, boolean internal, boolean deprecated, boolean experimental, List<EffectPreset> packagedPresets, String categoryId, List<? extends V> tags, Set<EffectAffinity> affinity, List<S> categories, Uri thumbnail, Uri backgroundImage, int iterCount, String iterParam, boolean hasOverdaw, float maxOverdraw, boolean autoTransform) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(localizedStrings, "localizedStrings");
        Intrinsics.checkNotNullParameter(shaderGroups, "shaderGroups");
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(passes, "passes");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(packagedPresets, "packagedPresets");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(affinity, "affinity");
        Intrinsics.checkNotNullParameter(categories, "categories");
        return new VisualEffect(id, name, desc, parameters, localizedStrings, shaderGroups, scripts, passes, uri, type, internal, deprecated, experimental, packagedPresets, categoryId, tags, affinity, categories, thumbnail, backgroundImage, iterCount, iterParam, hasOverdaw, maxOverdraw, autoTransform);
    }

    public final Set<EffectAffinity> getAffinity() {
        return this.affinity;
    }

    public final boolean getAutoTransform() {
        return this.autoTransform;
    }

    public final Uri getBackgroundImage() {
        return this.backgroundImage;
    }

    public final List<S> getCategories() {
        return this.categories;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final boolean getDeprecated() {
        return this.deprecated;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final boolean getExperimental() {
        return this.experimental;
    }

    public final boolean getHasOverdaw() {
        return this.hasOverdaw;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInternal() {
        return this.internal;
    }

    public final int getIterCount() {
        return this.iterCount;
    }

    public final String getIterParam() {
        return this.iterParam;
    }

    public final Iy.n getLocalizedStrings() {
        return this.localizedStrings;
    }

    public final float getMaxOverdraw() {
        return this.maxOverdraw;
    }

    public final String getName() {
        return this.name;
    }

    public final List<EffectPreset> getPackagedPresets() {
        return this.packagedPresets;
    }

    public final List<UserParameter> getParameters() {
        return this.parameters;
    }

    public final Map<String, UserParameter> getParamsById() {
        return (Map) this.paramsById.getValue();
    }

    public final List<EffectRenderPass> getPasses() {
        return this.passes;
    }

    public final List<ACScript> getScripts() {
        return this.scripts;
    }

    public final Map<Integer, ShaderGroup> getShaderGroups() {
        return this.shaderGroups;
    }

    public final List<V> getTags() {
        return this.tags;
    }

    public final Uri getThumbnail() {
        return this.thumbnail;
    }

    public final EffectType getType() {
        return this.type;
    }

    public final Uri getUri() {
        return this.uri;
    }
}
