package com.alightcreative.app.motion.scene.visualeffect;

import HI0.YzO;
import HI0.gnv;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.LruCache;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.ImageCacheKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.app.motion.scene.userparam.ChoiceInfo;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.EffectAffinity;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kgE.Md;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import yc.S;
import yc.V;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000e\u001a\u00020\r*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0015\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016\u001aA\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0004*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0017\u001a\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"\u001a%\u0010%\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u001f¢\u0006\u0004\b'\u0010(\u001a/\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\u0006\u0010*\u001a\u00020)2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0+\"\u00020)¢\u0006\u0004\b'\u0010-\u001a\u0017\u0010/\u001a\u0004\u0018\u00010\t2\u0006\u0010.\u001a\u00020\u0005¢\u0006\u0004\b/\u00100\u001a!\u00103\u001a\u000202*\u00020\u00002\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b3\u00104\u001a\u0013\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f¢\u0006\u0004\b5\u0010(\u001a%\u00106\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b6\u00107\u001a-\u00108\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b8\u00109\u001a#\u0010=\u001a\u00020\u001b*\u00020\u00002\b\u0010:\u001a\u0004\u0018\u00010\u00052\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>\u001a'\u0010D\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010\u00052\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010E\u001a\r\u0010G\u001a\u00020F¢\u0006\u0004\bG\u0010H\"8\u0010K\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010J\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L\" \u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\"\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R\"\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U\"&\u0010W\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0V0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010O\"\u0014\u0010X\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010R\"\u0014\u0010Y\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010U\"\u0014\u0010Z\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010[\"$\u0010\\\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010[\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`\"\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00050V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b\"\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e\"\u0017\u0010h\u001a\u0004\u0018\u00010\t*\u0002028F¢\u0006\u0006\u001a\u0004\bf\u0010g\"\u0017\u0010h\u001a\u0004\u0018\u00010\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bf\u0010i\"\u0015\u0010j\u001a\u00020B*\u00020\t8F¢\u0006\u0006\u001a\u0004\bj\u0010k\"\u0015\u0010m\u001a\u00020B*\u00020\t8F¢\u0006\u0006\u001a\u0004\bl\u0010k\"\u001b\u0010q\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020n8F¢\u0006\u0006\u001a\u0004\bo\u0010p\"\u001b\u0010t\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020\t8F¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006u"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "", "fractionalTime", "durationSeconds", "", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "paramsAtTime", "(Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;FF)Ljava/util/Map;", "Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Type;", "elementAffinity", "", "affinityFor", "(Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;Ljava/util/Set;)I", "Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectPresetTiming;", "timing", "presetDuration", "layerDuration", "adjustForTiming", "(Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;Lcom/alightcreative/app/motion/scene/visualeffect/EffectPresetTiming;II)Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;", "(Ljava/util/Map;Lcom/alightcreative/app/motion/scene/visualeffect/EffectPresetTiming;II)Ljava/util/Map;", "Landroid/content/Context;", "context", "assetPath", "", "initVisualEffectPresets", "(Landroid/content/Context;Ljava/lang/String;)V", "effectId", "", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectPreset;", "getVisualEffectPresets", "(Ljava/lang/String;)Ljava/util/List;", "LkgE/fuX;", "iapManager", "initVisualEffects", "(Landroid/content/Context;Ljava/lang/String;LkgE/fuX;)V", "getVisualEffects", "()Ljava/util/List;", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectType;", "type", "", "types", "(Lcom/alightcreative/app/motion/scene/visualeffect/EffectType;[Lcom/alightcreative/app/motion/scene/visualeffect/EffectType;)Ljava/util/List;", "id", "visualEffectById", "(Ljava/lang/String;)Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "time", "Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffectRef;", "valueAtTime", "(Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;FF)Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffectRef;", "getPresetLoadErrors", "loadVisualEffectPresets", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;", "loadVisualEffects", "(Landroid/content/Context;Ljava/lang/String;LkgE/fuX;)Ljava/util/List;", "namespace", "Lorg/xmlpull/v1/XmlSerializer;", "serializer", "serialize", "(Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;)V", "ns", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "", "isPackage", "unserializeVisualEffect", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Z)Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "", "nextEffectInstanceId", "()J", "Landroid/util/LruCache;", "Lkotlin/Pair;", "effectParamsCache", "Landroid/util/LruCache;", "", "loadedVisualEffects", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "visualEffectsInitState", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CountDownLatch;", "visualEffectsLoaded", "Ljava/util/concurrent/CountDownLatch;", "", "loadedVisualEffectPresets", "visualEffectPresetsInitState", "visualEffectPresetsLoaded", "APP_STRING_PREFIX", "Ljava/lang/String;", "effectSig", "getEffectSig", "()Ljava/lang/String;", "setEffectSig", "(Ljava/lang/String;)V", "presetLoadErrors", "Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicLong;", "nextEID", "Ljava/util/concurrent/atomic/AtomicLong;", "getEffect", "(Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffectRef;)Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "effect", "(Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;)Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "isNaturallyTimeDependent", "(Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;)Z", "getHasWarpEffects", "hasWarpEffects", "Lcom/alightcreative/app/motion/scene/SceneElement;", "getAffinityTypes", "(Lcom/alightcreative/app/motion/scene/SceneElement;)Ljava/util/Set;", "affinityTypes", "getPresets", "(Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;)Ljava/util/List;", "presets", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVisualEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisualEffect.kt\ncom/alightcreative/app/motion/scene/visualeffect/VisualEffectKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 8 XmlUtil.kt\ncom/alightcreative/ext/XmlUtilKt\n*L\n1#1,777:1\n1755#2,3:778\n1755#2,3:783\n1734#2,3:786\n1755#2,3:789\n1557#2:792\n1628#2,3:793\n774#2:796\n865#2,2:797\n1557#2:799\n1628#2,3:800\n774#2:803\n865#2,2:804\n1246#2,4:808\n774#2:812\n865#2,2:813\n1863#2:821\n1557#2:830\n1628#2,3:831\n774#2:834\n865#2,2:835\n1611#2,9:837\n1863#2:846\n1557#2:847\n1628#2,3:848\n1864#2:852\n1620#2:853\n1864#2:854\n1368#2:855\n1454#2,2:856\n774#2:858\n865#2,2:859\n774#2:861\n865#2:862\n1782#2,4:863\n866#2:867\n1557#2:868\n1628#2,3:869\n1557#2:872\n1628#2,3:873\n1734#2,2:877\n1782#2,4:879\n1736#2:883\n1557#2:885\n1628#2,3:886\n1456#2,3:889\n1863#2:892\n1611#2,9:893\n1863#2:902\n1864#2:904\n1620#2:905\n1557#2:906\n1628#2,3:907\n1368#2:910\n1454#2,2:911\n1557#2:913\n1628#2,3:914\n1456#2,3:917\n774#2:920\n865#2,2:921\n774#2:923\n865#2,2:924\n1864#2:926\n1863#2,2:941\n1782#2,4:950\n1782#2,4:954\n1782#2,4:958\n1782#2,4:962\n1782#2,4:966\n1782#2,4:970\n1557#2:974\n1628#2,3:975\n774#2:978\n865#2,2:979\n774#2:981\n865#2,2:982\n1557#2:984\n1628#2,2:985\n1557#2:987\n1628#2,3:988\n1630#2:991\n774#2:992\n865#2,2:993\n1251#3,2:781\n127#3:876\n128#3:884\n462#4:806\n412#4:807\n535#4:823\n520#4,6:824\n381#4,7:943\n10065#5:815\n10487#5,5:816\n1#6:822\n1#6:851\n1#6:903\n216#7,2:927\n45#8,12:929\n*S KotlinDebug\n*F\n+ 1 VisualEffect.kt\ncom/alightcreative/app/motion/scene/visualeffect/VisualEffectKt\n*L\n186#1:778,3\n228#1:783,3\n258#1:786,3\n259#1:789,3\n324#1:792\n324#1:793,3\n324#1:796\n324#1:797,2\n325#1:799\n325#1:800,3\n325#1:803\n325#1:804,2\n350#1:808,4\n432#1:812\n432#1:813,2\n456#1:821\n495#1:830\n495#1:831,3\n496#1:834\n496#1:835,2\n497#1:837,9\n497#1:846\n500#1:847\n500#1:848,3\n497#1:852\n497#1:853\n456#1:854\n574#1:855\n574#1:856,2\n575#1:858\n575#1:859,2\n576#1:861\n576#1:862\n576#1:863,4\n576#1:867\n577#1:868\n577#1:869,3\n580#1:872\n580#1:873,3\n626#1:877,2\n626#1:879,4\n626#1:883\n628#1:885\n628#1:886,3\n574#1:889,3\n652#1:892\n663#1:893,9\n663#1:902\n663#1:904\n663#1:905\n664#1:906\n664#1:907,3\n665#1:910\n665#1:911,2\n665#1:913\n665#1:914,3\n665#1:917,3\n667#1:920\n667#1:921,2\n668#1:923\n668#1:924,2\n652#1:926\n756#1:941,2\n410#1:950,4\n411#1:954,4\n412#1:958,4\n413#1:962,4\n414#1:966,4\n415#1:970,4\n570#1:974\n570#1:975,3\n570#1:978\n570#1:979,2\n570#1:981\n570#1:982,2\n583#1:984\n583#1:985,2\n586#1:987\n586#1:988,3\n583#1:991\n648#1:992\n648#1:993,2\n214#1:781,2\n625#1:876\n625#1:884\n350#1:806\n350#1:807\n472#1:823\n472#1:824,6\n365#1:943,7\n432#1:815\n432#1:816,5\n497#1:851\n663#1:903\n731#1:927,2\n745#1:929,12\n*E\n"})
public final class VisualEffectKt {
    private static final String APP_STRING_PREFIX = "@am:string/";
    private static String effectSig;
    private static final LruCache<Pair<KeyableVisualEffectRef, Float>, Map<String, UserParameterValue>> effectParamsCache = new LruCache<>(100);
    private static final Map<String, VisualEffect> loadedVisualEffects = new LinkedHashMap();
    private static final AtomicBoolean visualEffectsInitState = new AtomicBoolean();
    private static final CountDownLatch visualEffectsLoaded = new CountDownLatch(1);
    private static final Map<String, List<EffectPreset>> loadedVisualEffectPresets = new LinkedHashMap();
    private static final AtomicBoolean visualEffectPresetsInitState = new AtomicBoolean();
    private static final CountDownLatch visualEffectPresetsLoaded = new CountDownLatch(1);
    private static final List<String> presetLoadErrors = new ArrayList();
    private static final AtomicLong nextEID = new AtomicLong(1000);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EffectPresetTiming.values().length];
            try {
                iArr[EffectPresetTiming.Stretch.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EffectPresetTiming.Extend.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EffectPresetTiming.ExtendMatch.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EffectPresetTiming.Split.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EffectPresetTiming.Start.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EffectPresetTiming.End.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KeyableUserParameterValue adjustForTiming(final KeyableUserParameterValue keyableUserParameterValue, EffectPresetTiming timing, final int i2, final int i3) {
        float fFloatValue;
        List keyframesIfKeyed;
        List keyframesIfKeyed2;
        Intrinsics.checkNotNullParameter(keyableUserParameterValue, "<this>");
        Intrinsics.checkNotNullParameter(timing, "timing");
        Keyable<? extends Object> keyable = UserParameterKt.getKeyable(keyableUserParameterValue);
        if (keyable != null && keyable.getKeyed()) {
            double d2 = i3;
            final float f3 = (float) (d2 / ((double) i2));
            final float f4 = (float) (10.0d / d2);
            Keyable<? extends Object> keyable2 = UserParameterKt.getKeyable(keyableUserParameterValue);
            float fFloatValue2 = 0.0f;
            if (keyable2 == null || (keyframesIfKeyed2 = KeyableKt.getKeyframesIfKeyed(keyable2)) == null) {
                fFloatValue = 0.0f;
            } else {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframesIfKeyed2, 10));
                Iterator it = keyframesIfKeyed2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf(((Keyframe) it.next()).getTime()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((Number) obj).floatValue() <= 0.45f) {
                        arrayList2.add(obj);
                    }
                }
                Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) arrayList2);
                if (fMaxOrNull != null) {
                    fFloatValue = fMaxOrNull.floatValue();
                }
            }
            int iAdjustForTiming$toPresetMillis = adjustForTiming$toPresetMillis(fFloatValue, i2);
            Keyable<? extends Object> keyable3 = UserParameterKt.getKeyable(keyableUserParameterValue);
            if (keyable3 != null && (keyframesIfKeyed = KeyableKt.getKeyframesIfKeyed(keyable3)) != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframesIfKeyed, 10));
                Iterator it2 = keyframesIfKeyed.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Float.valueOf(((Keyframe) it2.next()).getTime()));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (((Number) obj2).floatValue() >= 0.55f) {
                        arrayList4.add(obj2);
                    }
                }
                Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) arrayList4);
                if (fMinOrNull != null) {
                    fFloatValue2 = fMinOrNull.floatValue();
                }
            }
            int iAdjustForTiming$toPresetMillis2 = iAdjustForTiming$toPresetMillis + (i2 - adjustForTiming$toPresetMillis(fFloatValue2, i2));
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            switch (iArr[timing.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                case 6:
                    if (i3 <= (iAdjustForTiming$toPresetMillis2 * 110) / 100) {
                        timing = EffectPresetTiming.Stretch;
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            final EffectPresetTiming effectPresetTiming = timing;
            XoT.C.Uo(keyableUserParameterValue, new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VisualEffectKt.adjustForTiming$lambda$12(effectPresetTiming, i3, i2);
                }
            });
            switch (iArr[effectPresetTiming.ordinal()]) {
                case 1:
                    return keyableUserParameterValue;
                case 2:
                    return UserParameterKt.copyAdjustingValue(keyableUserParameterValue, new Function1() { // from class: com.alightcreative.app.motion.scene.visualeffect.CN3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return Float.valueOf(VisualEffectKt.adjustForTiming$lambda$13(f3, ((Float) obj3).floatValue()));
                        }
                    });
                case 3:
                    return UserParameterKt.copyAdjustingValue(keyableUserParameterValue, new Function1() { // from class: com.alightcreative.app.motion.scene.visualeffect.fuX
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return Float.valueOf(VisualEffectKt.adjustForTiming$lambda$14(f3, ((Float) obj3).floatValue()));
                        }
                    });
                case 4:
                    return UserParameterKt.copyAdjustingTime(keyableUserParameterValue, new Function1() { // from class: com.alightcreative.app.motion.scene.visualeffect.Dsr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return Float.valueOf(VisualEffectKt.adjustForTiming$lambda$16(i3, i2, keyableUserParameterValue, f4, effectPresetTiming, ((Float) obj3).floatValue()));
                        }
                    });
                case 5:
                    return UserParameterKt.copyAdjustingTime(keyableUserParameterValue, new Function1() { // from class: com.alightcreative.app.motion.scene.visualeffect.aC
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return Float.valueOf(VisualEffectKt.adjustForTiming$lambda$17(i2, i3, f4, ((Float) obj3).floatValue()));
                        }
                    });
                case 6:
                    return UserParameterKt.copyAdjustingTime(keyableUserParameterValue, new Function1() { // from class: com.alightcreative.app.motion.scene.visualeffect.C
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return Float.valueOf(VisualEffectKt.adjustForTiming$lambda$18(i3, i2, f4, ((Float) obj3).floatValue()));
                        }
                    });
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return keyableUserParameterValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float adjustForTiming$lambda$13(float f3, float f4) {
        return f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float adjustForTiming$lambda$14(float f3, float f4) {
        return f3;
    }

    private static final float adjustForTiming$toLayerFraction(int i2, int i3, float f3) {
        float f4 = (float) (((double) i2) / ((double) i3));
        if (f4 < f3) {
            return 0.0f;
        }
        if (f4 > 1.0f - f3) {
            return 1.0f;
        }
        if (f4 <= 0.5f - f3 || f4 >= f3 + 0.5f) {
            return f4;
        }
        return 0.5f;
    }

    private static final int adjustForTiming$toPresetMillis(float f3, int i2) {
        return MathKt.roundToInt(((double) i2) * ((double) f3));
    }

    public static final VisualEffect getEffect(VisualEffectRef visualEffectRef) {
        Intrinsics.checkNotNullParameter(visualEffectRef, "<this>");
        return visualEffectById(visualEffectRef.getId());
    }

    public static final List<VisualEffect> getVisualEffects() {
        visualEffectsLoaded.await();
        return CollectionsKt.toList(loadedVisualEffects.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VisualEffect _get_affinityTypes_$lambda$2(KeyableVisualEffectRef it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return visualEffectById(it.getId());
    }

    public static final int affinityFor(VisualEffect visualEffect, Set<? extends EffectAffinity.Type> elementAffinity) {
        Intrinsics.checkNotNullParameter(visualEffect, "<this>");
        Intrinsics.checkNotNullParameter(elementAffinity, "elementAffinity");
        if (visualEffect.getAffinity().isEmpty()) {
            return 2;
        }
        Set<EffectAffinity> affinity = visualEffect.getAffinity();
        if (!(affinity instanceof Collection) || !affinity.isEmpty()) {
            for (EffectAffinity effectAffinity : affinity) {
                if (effectAffinity.getStrength() == EffectAffinity.Strength.Required && !elementAffinity.contains(effectAffinity.getType())) {
                    return 0;
                }
            }
        }
        Set<EffectAffinity> affinity2 = visualEffect.getAffinity();
        if ((affinity2 instanceof Collection) && affinity2.isEmpty()) {
            return 1;
        }
        Iterator<T> it = affinity2.iterator();
        while (it.hasNext()) {
            if (elementAffinity.contains(((EffectAffinity) it.next()).getType())) {
                return 2;
            }
        }
        return 1;
    }

    public static final Set<EffectAffinity.Type> getAffinityTypes(SceneElement sceneElement) {
        boolean z2;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = SequencesKt.mapNotNull(CollectionsKt.asSequence(sceneElement.getVisualEffects().values()), new Function1() { // from class: com.alightcreative.app.motion.scene.visualeffect.Pl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VisualEffectKt._get_affinityTypes_$lambda$2((KeyableVisualEffectRef) obj);
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((VisualEffect) it.next()).getAutoTransform()) {
                z2 = true;
                break;
            }
        }
        if (sceneElement.getType().getHasText()) {
            linkedHashSet.add(EffectAffinity.Type.Text);
        }
        if (sceneElement.getType().getHasFillType() && sceneElement.getFillType() == FillType.MEDIA && (sceneElement.getFillImage() != null || sceneElement.getFillVideo() != null)) {
            linkedHashSet.add(EffectAffinity.Type.Media);
        }
        if (sceneElement.getType() == SceneElementType.Drawing) {
            linkedHashSet.add(EffectAffinity.Type.Freehand);
        }
        if (sceneElement.getType().getHasStroke() && sceneElement.getStroke().getEnabled()) {
            linkedHashSet.add(EffectAffinity.Type.Stroke);
        }
        List<Keyable<? extends Object>> keyableProperties = SceneElementKt.getKeyableProperties(sceneElement);
        if (keyableProperties == null || !keyableProperties.isEmpty()) {
            Iterator<T> it2 = keyableProperties.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((Keyable) it2.next()).getKeyed()) {
                    linkedHashSet.add(EffectAffinity.Type.Animation);
                    break;
                }
            }
        }
        if (sceneElement.getType().getHasTransform() && (sceneElement.getTransform().getLocation().getKeyed() || sceneElement.getTransform().getScale().getKeyed() || sceneElement.getTransform().getRotation().getKeyed() || z2)) {
            linkedHashSet.add(EffectAffinity.Type.TransformAnimation);
        }
        return linkedHashSet;
    }

    public static final VisualEffect getEffect(KeyableVisualEffectRef keyableVisualEffectRef) {
        Intrinsics.checkNotNullParameter(keyableVisualEffectRef, "<this>");
        return visualEffectById(keyableVisualEffectRef.getId());
    }

    public static final String getEffectSig() {
        return effectSig;
    }

    public static final boolean getHasWarpEffects(VisualEffect visualEffect) {
        Intrinsics.checkNotNullParameter(visualEffect, "<this>");
        List<S> categories = visualEffect.getCategories();
        if (categories != null && categories.isEmpty()) {
            return false;
        }
        Iterator<T> it = categories.iterator();
        while (it.hasNext()) {
            if (((S) it.next()).n() == 106) {
                return true;
            }
        }
        return false;
    }

    public static final List<String> getPresetLoadErrors() throws InterruptedException {
        visualEffectPresetsLoaded.await();
        return presetLoadErrors;
    }

    public static final List<EffectPreset> getPresets(VisualEffect visualEffect) {
        Intrinsics.checkNotNullParameter(visualEffect, "<this>");
        return getVisualEffectPresets(visualEffect.getId());
    }

    public static final List<EffectPreset> getVisualEffectPresets(String effectId) throws InterruptedException {
        Intrinsics.checkNotNullParameter(effectId, "effectId");
        visualEffectPresetsLoaded.await();
        List<EffectPreset> list = loadedVisualEffectPresets.get(effectId);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public static final void initVisualEffectPresets(Context context, final String assetPath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        final Context applicationContext = context.getApplicationContext();
        ThreadsKt.thread$default(false, false, null, "visualEffectPresetLoader", 0, new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.Xo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VisualEffectKt.initVisualEffectPresets$lambda$25(applicationContext, assetPath);
            }
        }, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVisualEffectPresets$lambda$25(Context context, String str) throws IOException {
        if (visualEffectPresetsInitState.getAndSet(true)) {
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(context);
        List<EffectPreset> listLoadVisualEffectPresets = loadVisualEffectPresets(context, str);
        for (EffectPreset effectPreset : listLoadVisualEffectPresets) {
            Map<String, List<EffectPreset>> map = loadedVisualEffectPresets;
            String effectId = effectPreset.getEffectId();
            List<EffectPreset> arrayList = map.get(effectId);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(effectId, arrayList);
            }
            arrayList.add(effectPreset);
        }
        visualEffectPresetsLoaded.countDown();
        XoT.C.KN("Presets", new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VisualEffectKt.initVisualEffectPresets$lambda$25$lambda$21();
            }
        });
        for (final EffectPreset effectPreset2 : listLoadVisualEffectPresets) {
            final VisualEffect visualEffectVisualEffectById = visualEffectById(effectPreset2.getEffectId());
            XoT.C.KN("Presets", new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.qz
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VisualEffectKt.initVisualEffectPresets$lambda$25$lambda$22(effectPreset2, visualEffectVisualEffectById);
                }
            });
        }
        XoT.C.KN("Presets", new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VisualEffectKt.initVisualEffectPresets$lambda$25$lambda$23();
            }
        });
        for (final EffectPreset effectPreset3 : listLoadVisualEffectPresets) {
            if (!StringsKt.startsWith$default(effectPreset3.getLabel(), APP_STRING_PREFIX, false, 2, (Object) null)) {
                XoT.C.KN("Presets:String", new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.QJ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return VisualEffectKt.initVisualEffectPresets$lambda$25$lambda$24(effectPreset3);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initVisualEffectPresets$lambda$25$lambda$21() {
        return "All presets";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initVisualEffectPresets$lambda$25$lambda$23() {
        return "Preset Strings";
    }

    public static final void initVisualEffects(final Context context, final String assetPath, final kgE.fuX iapManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        final Context applicationContext = context.getApplicationContext();
        ThreadsKt.thread$default(false, false, null, "visualEffectsLoader", 0, new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VisualEffectKt.initVisualEffects$lambda$37(applicationContext, assetPath, iapManager, context);
            }
        }, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVisualEffects$lambda$37(Context context, String str, kgE.fuX fux, Context context2) {
        if (visualEffectsInitState.getAndSet(true)) {
            return Unit.INSTANCE;
        }
        XoT.C.KN("initVisualEffects", new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.UGc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VisualEffectKt.initVisualEffects$lambda$37$lambda$26();
            }
        });
        Intrinsics.checkNotNull(context);
        for (VisualEffect visualEffect : loadVisualEffects(context, str, fux)) {
            loadedVisualEffects.put(visualEffect.getId(), visualEffect);
        }
        visualEffectsLoaded.countDown();
        initVisualEffectPresets(context, str + "/presets");
        final List list = CollectionsKt.toList(loadedVisualEffects.values());
        XoT.C.KN("initVisualEffects", new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.Q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VisualEffectKt.initVisualEffects$lambda$37$lambda$33(list);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initVisualEffects$lambda$37$lambda$26() {
        return "Loading visual effects ";
    }

    public static final boolean isNaturallyTimeDependent(VisualEffect visualEffect) {
        Intrinsics.checkNotNullParameter(visualEffect, "<this>");
        return !visualEffect.getScripts().isEmpty();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0653 A[LOOP:13: B:203:0x0586->B:249:0x0653, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x060a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02af  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List<EffectPreset> loadVisualEffectPresets(Context context, String str) throws IOException {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        ?? r15;
        String[] list;
        List listSorted;
        Iterator it;
        int i3;
        int i5;
        Map map;
        Pair pair;
        String strReplace;
        String str2;
        String str3;
        EffectPresetTiming effectPresetTiming;
        String strReplace$default;
        String str4 = str;
        ArrayList arrayList = new ArrayList();
        Context contextAz = XoT.fuX.az(context);
        AssetManager assets = context.getAssets();
        Throwable th = null;
        int i7 = 1;
        boolean z5 = false;
        if (assets != null && (list = assets.list(str4)) != null && (listSorted = ArraysKt.sorted(list)) != null) {
            Iterator it2 = listSorted.iterator();
            while (it2.hasNext()) {
                String str5 = (String) it2.next();
                Intrinsics.checkNotNull(str5);
                int i8 = 2;
                if (StringsKt.endsWith$default(str5, ".xml", z5, 2, (Object) th)) {
                    InputStream inputStreamOpen = context.getAssets().open(new File(new File(str4), str5).getPath());
                    Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
                    try {
                        String text = TextStreamsKt.readText(inputStreamReader);
                        CloseableKt.closeFinally(inputStreamReader, th);
                        for (SceneElement sceneElement : SceneSerializerKt.unserializeScene$default(text, false, false, false, 12, null).getElements()) {
                            String label = sceneElement.getLabel();
                            List arrayList2 = new ArrayList();
                            if (sceneElement.getType() == SceneElementType.Audio || sceneElement.getType() == SceneElementType.Scene) {
                                it = it2;
                                i3 = i8;
                                loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Audio and Scene elements are not supported in projects use for preset definitions");
                                i8 = i3;
                                it2 = it;
                                i7 = 1;
                            } else {
                                Map<Long, KeyableVisualEffectRef> visualEffects = sceneElement.getVisualEffects();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Map.Entry<Long, KeyableVisualEffectRef> entry : visualEffects.entrySet()) {
                                    if (!entry.getValue().getHidden()) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                if (linkedHashMap.size() > i7) {
                                    loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "At most one visual effect per layer is allowed in projects use for preset definitions");
                                } else {
                                    KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) CollectionsKt.singleOrNull(linkedHashMap.values());
                                    if (keyableVisualEffectRef == null) {
                                        i7 = 1;
                                    } else {
                                        VisualEffect visualEffectVisualEffectById = visualEffectById(keyableVisualEffectRef.getId());
                                        if (visualEffectVisualEffectById == null) {
                                            loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Unknown effect '" + keyableVisualEffectRef.getId() + "'");
                                        } else {
                                            int i9 = i7;
                                            List<String> listSplit = new Regex(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)").split(label, i8);
                                            if (listSplit.size() >= i8) {
                                                it = it2;
                                                i5 = 0;
                                            } else {
                                                it = it2;
                                                i5 = 0;
                                                if (StringsKt.contains$default((CharSequence) CollectionsKt.single((List) listSplit), (CharSequence) ":", false, i8, (Object) null)) {
                                                    ?? r152 = new String[i8];
                                                    r152[0] = 0;
                                                    r152[i9] = CollectionsKt.single((List) listSplit);
                                                    listSplit = CollectionsKt.listOf((Object[]) r152);
                                                } else {
                                                    ?? r153 = new String[i8];
                                                    r153[0] = CollectionsKt.single((List) listSplit);
                                                    r153[i9] = 0;
                                                    listSplit = CollectionsKt.listOf((Object[]) r153);
                                                }
                                            }
                                            String str6 = listSplit.get(i5);
                                            String str7 = listSplit.get(i9);
                                            if (str7 == null) {
                                                map = MapsKt.emptyMap();
                                            } else {
                                                List<String> listSplit2 = new Regex(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)").split(str7, i5);
                                                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit2, 10));
                                                Iterator it3 = listSplit2.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList3.add(StringsKt.trim((CharSequence) it3.next()).toString());
                                                }
                                                ArrayList arrayList4 = new ArrayList();
                                                for (Object obj : arrayList3) {
                                                    if (!StringsKt.isBlank((String) obj)) {
                                                        arrayList4.add(obj);
                                                    }
                                                }
                                                ArrayList arrayList5 = new ArrayList();
                                                Iterator it4 = arrayList4.iterator();
                                                while (it4.hasNext()) {
                                                    List listSplit$default = StringsKt.split$default((CharSequence) it4.next(), new String[]{":"}, false, 2, 2, (Object) null);
                                                    Iterator it5 = it4;
                                                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                                                    Iterator it6 = listSplit$default.iterator();
                                                    while (it6.hasNext()) {
                                                        arrayList6.add(StringsKt.trim((CharSequence) it6.next()).toString());
                                                    }
                                                    if (arrayList6.size() != 2) {
                                                        loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Layer name format incorrect");
                                                        pair = null;
                                                    } else {
                                                        pair = TuplesKt.to((String) arrayList6.get(0), (String) arrayList6.get(1));
                                                    }
                                                    if (pair != null) {
                                                        arrayList5.add(pair);
                                                    }
                                                    it4 = it5;
                                                }
                                                map = MapsKt.toMap(arrayList5);
                                            }
                                            if (str6 == null || (strReplace$default = StringsKt.replace$default(str6, " ", "_", false, 4, (Object) null)) == null) {
                                                strReplace = null;
                                                String str8 = strReplace != null ? null : "@am:string/effectpreset_" + strReplace;
                                                str2 = (String) map.get("label");
                                                if (str2 == null) {
                                                    str8 = str2;
                                                } else if (str8 == null) {
                                                    str8 = "unknown";
                                                }
                                                str3 = (String) map.get("id");
                                                if (str3 != null) {
                                                    strReplace = str3;
                                                }
                                                if (strReplace != null) {
                                                    loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Missing ID");
                                                    it2 = it;
                                                    i7 = 1;
                                                    z5 = false;
                                                    i8 = 2;
                                                } else {
                                                    String strRl = Iy.w6.rl(str8, context);
                                                    String str9 = strReplace;
                                                    String str10 = str8;
                                                    z5 = false;
                                                    i8 = 2;
                                                    if (!StringsKt.startsWith$default(strRl, "?", false, 2, (Object) null) || str6 == null) {
                                                        str6 = str10;
                                                    }
                                                    String str11 = (String) map.get("t");
                                                    if (str11 != null) {
                                                        Locale ROOT = Locale.ROOT;
                                                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                        String lowerCase = str11.toLowerCase(ROOT);
                                                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                                        String string = lowerCase != null ? StringsKt.trim((CharSequence) lowerCase).toString() : null;
                                                        if (string != null) {
                                                            switch (string.hashCode()) {
                                                                case -1881872635:
                                                                    if (string.equals("stretch")) {
                                                                        effectPresetTiming = EffectPresetTiming.Stretch;
                                                                    }
                                                                    loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Unknown preset timing '" + string + "'");
                                                                    break;
                                                                case -1539739310:
                                                                    if (string.equals("extend-match")) {
                                                                        effectPresetTiming = EffectPresetTiming.ExtendMatch;
                                                                    }
                                                                    loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Unknown preset timing '" + string + "'");
                                                                    break;
                                                                case -1289044198:
                                                                    if (string.equals("extend")) {
                                                                        effectPresetTiming = EffectPresetTiming.Extend;
                                                                    }
                                                                    loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Unknown preset timing '" + string + "'");
                                                                    break;
                                                                case 100571:
                                                                    if (string.equals(TtmlNode.END)) {
                                                                        effectPresetTiming = EffectPresetTiming.End;
                                                                    }
                                                                    loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Unknown preset timing '" + string + "'");
                                                                    break;
                                                                case 109648666:
                                                                    if (string.equals(V8ValueBuiltInSymbol.PROPERTY_SPLIT)) {
                                                                        effectPresetTiming = EffectPresetTiming.Split;
                                                                    }
                                                                    loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Unknown preset timing '" + string + "'");
                                                                    break;
                                                                case 109757538:
                                                                    if (string.equals(TtmlNode.START)) {
                                                                        effectPresetTiming = EffectPresetTiming.Start;
                                                                    }
                                                                    loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Unknown preset timing '" + string + "'");
                                                                    break;
                                                                default:
                                                                    loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Unknown preset timing '" + string + "'");
                                                                    break;
                                                            }
                                                            it2 = it;
                                                            i7 = 1;
                                                        } else {
                                                            effectPresetTiming = EffectPresetTiming.Stretch;
                                                        }
                                                        if (visualEffectVisualEffectById.getDeprecated()) {
                                                            loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Use of deprecated effect '" + visualEffectVisualEffectById.getId() + "'");
                                                        } else if (visualEffectVisualEffectById.getInternal()) {
                                                            loadVisualEffectPresets$lambda$46$presetError(str5, label, arrayList2, "Use of internal effect '" + visualEffectVisualEffectById.getId() + "'");
                                                        } else {
                                                            visualEffectVisualEffectById.getExperimental();
                                                        }
                                                        int endTime = sceneElement.getEndTime() - sceneElement.getStartTime();
                                                        Map<String, KeyableUserParameterValue> parameters = keyableVisualEffectRef.getParameters();
                                                        String id = keyableVisualEffectRef.getId();
                                                        if (arrayList2.isEmpty()) {
                                                            arrayList2 = CollectionsKt.emptyList();
                                                        }
                                                        i3 = 2;
                                                        arrayList.add(new EffectPreset(str9, str6, "", endTime, effectPresetTiming, parameters, id, arrayList2, str5));
                                                        i8 = i3;
                                                        it2 = it;
                                                        i7 = 1;
                                                    }
                                                }
                                            } else {
                                                Locale ROOT2 = Locale.ROOT;
                                                Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
                                                String lowerCase2 = strReplace$default.toLowerCase(ROOT2);
                                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                                if (lowerCase2 != null) {
                                                    strReplace = new Regex("[^A-Za-z0-9_]").replace(lowerCase2, "");
                                                }
                                                if (strReplace != null) {
                                                }
                                                str2 = (String) map.get("label");
                                                if (str2 == null) {
                                                }
                                                str3 = (String) map.get("id");
                                                if (str3 != null) {
                                                }
                                                if (strReplace != null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
                str4 = str;
                it2 = it2;
                th = null;
                i7 = 1;
            }
            Unit unit = Unit.INSTANCE;
        }
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"TO", "AND", "OR", "OF", "FROM", "TO", "THEN"});
        List listListOf2 = CollectionsKt.listOf("FU");
        Set<String> set = SequencesKt.toSet(SequencesKt.map(CollectionsKt.asSequence(arrayList), new Function1() { // from class: com.alightcreative.app.motion.scene.visualeffect.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return VisualEffectKt.loadVisualEffectPresets$lambda$51((EffectPreset) obj2);
            }
        }));
        ArrayList arrayList7 = new ArrayList();
        for (final String str12 : set) {
            ArrayList<EffectPreset> arrayList8 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (Intrinsics.areEqual(((EffectPreset) obj2).getEffectId(), str12)) {
                    arrayList8.add(obj2);
                }
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj3 : arrayList8) {
                EffectPreset effectPreset = (EffectPreset) obj3;
                if (arrayList8.isEmpty()) {
                    r15 = z5;
                } else {
                    Iterator it7 = arrayList8.iterator();
                    r15 = z5;
                    while (it7.hasNext()) {
                        ArrayList arrayList10 = arrayList;
                        if (Intrinsics.areEqual(((EffectPreset) it7.next()).getLabel(), effectPreset.getLabel()) && (r15 = r15 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                        arrayList = arrayList10;
                        r15 = r15;
                    }
                }
                ArrayList arrayList11 = arrayList;
                if (r15 > 1) {
                    arrayList9.add(obj3);
                }
                arrayList = arrayList11;
                z5 = false;
            }
            ArrayList arrayList12 = arrayList;
            ArrayList arrayList13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
            for (EffectPreset effectPreset2 : arrayList8) {
                arrayList13.add(new PresetInfo(effectPreset2, "", loadVisualEffectPresets$toEnglishUCWords(effectPreset2.getLabel(), contextAz, listListOf)));
            }
            if (!arrayList9.isEmpty()) {
                List<String> list2 = presetLoadErrors;
                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                Iterator it8 = arrayList9.iterator();
                while (it8.hasNext()) {
                    arrayList14.add(((EffectPreset) it8.next()).getLabel());
                }
                list2.add("Duplicate preset name: effect '" + str12 + "', presets: " + CollectionsKt.joinToString$default(CollectionsKt.toSortedSet(arrayList14), ", ", null, null, 0, null, null, 62, null) + " ");
            }
            XoT.C.KN("PresetCode", new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VisualEffectKt.loadVisualEffectPresets$lambda$67$lambda$59(str12);
                }
            });
            for (Object obj4 : SequencesKt.onEach(SequencesKt.sequence(new VisualEffectKt$loadVisualEffectPresets$2$3(arrayList13, null)), new Function1() { // from class: com.alightcreative.app.motion.scene.visualeffect.I28
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    return VisualEffectKt.loadVisualEffectPresets$lambda$67$lambda$62((List) obj5);
                }
            })) {
                List list3 = (List) obj4;
                if (arrayList9.isEmpty()) {
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it9 = list3.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                PresetInfo presetInfo = (PresetInfo) it9.next();
                                if (list3 == null || !list3.isEmpty()) {
                                    Iterator it10 = list3.iterator();
                                    i2 = 0;
                                    while (it10.hasNext()) {
                                        if (Intrinsics.areEqual(((PresetInfo) it10.next()).getCode(), presetInfo.getCode()) && (i2 = i2 + 1) < 0) {
                                            CollectionsKt.throwCountOverflow();
                                        }
                                    }
                                } else {
                                    i2 = 0;
                                }
                                z2 = true;
                                if (!(i2 <= 1 && !listListOf2.contains(presetInfo.getCode()))) {
                                    z4 = false;
                                }
                            } else {
                                z2 = true;
                                z4 = true;
                            }
                        }
                    } else {
                        z2 = true;
                        z4 = true;
                    }
                    if (!z4) {
                        z3 = false;
                    }
                    if (!z3) {
                        Iterable<PresetInfo> iterable = (Iterable) obj4;
                        ArrayList arrayList15 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        for (PresetInfo presetInfo2 : iterable) {
                            arrayList15.add(EffectPreset.copy$default(presetInfo2.getPreset(), null, null, presetInfo2.getCode(), 0, null, null, null, null, null, 507, null));
                        }
                        CollectionsKt.addAll(arrayList7, arrayList15);
                        arrayList = arrayList12;
                        z5 = false;
                    }
                } else {
                    z2 = true;
                }
                z3 = z2;
                if (!z3) {
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        return arrayList7;
    }

    private static final void loadVisualEffectPresets$lambda$46$presetError(String str, String str2, List<String> list, String str3) {
        presetLoadErrors.add(str + "[\"" + str2 + "\"]: " + str3);
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        sb.append(str2);
        sb.append("\": ");
        sb.append(str3);
        list.add(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String loadVisualEffectPresets$lambda$51(EffectPreset it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getEffectId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String loadVisualEffectPresets$lambda$67$lambda$59(String str) {
        return "Finding code for effect: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadVisualEffectPresets$lambda$67$lambda$62(final List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        XoT.C.KN("PresetCode", new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.s4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VisualEffectKt.loadVisualEffectPresets$lambda$67$lambda$62$lambda$61(it);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String loadVisualEffectPresets$lambda$67$lambda$62$lambda$61(List list) {
        return "Candidate! " + CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.alightcreative.app.motion.scene.visualeffect.l3D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VisualEffectKt.loadVisualEffectPresets$lambda$67$lambda$62$lambda$61$lambda$60((PresetInfo) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence loadVisualEffectPresets$lambda$67$lambda$62$lambda$61$lambda$60(PresetInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<PresetInfo> loadVisualEffectPresets$lambda$67$updateCodes(List<PresetInfo> list) {
        String strTake;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (PresetInfo presetInfo : list) {
            if (presetInfo.getWords().size() >= 2) {
                List listTake = CollectionsKt.take(presetInfo.getWords(), 2);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
                Iterator it = listTake.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Character.valueOf(StringsKt.first((String) it.next())));
                }
                strTake = CollectionsKt.joinToString$default(arrayList2, "", null, null, 0, null, null, 62, null);
            } else {
                strTake = StringsKt.take((String) CollectionsKt.first((List) presetInfo.getWords()), 2);
            }
            arrayList.add(PresetInfo.copy$default(presetInfo, null, strTake, null, 5, null));
        }
        return arrayList;
    }

    private static final List<VisualEffect> loadVisualEffects(Context context, String str, kgE.fuX fux) throws NoSuchAlgorithmException, IOException {
        String[] list;
        List<String> listSorted;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        char c2;
        Collection collectionEmptyList;
        List<ChoiceInfo> choices;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = "AMVESIG".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        Regex regex = new Regex("[^A-Za-z,0-9(){}_.+\\]\\[\\-*@#$=]");
        new Regex("[^A-Za-z]");
        AssetManager assets = context.getAssets();
        if (assets != null && (list = assets.list(str2)) != null && (listSorted = ArraysKt.sorted(list)) != null) {
            for (String str3 : listSorted) {
                Intrinsics.checkNotNull(str3);
                if (StringsKt.endsWith$default(str3, ".xml", false, 2, (Object) null)) {
                    InputStream inputStreamOpen = context.getAssets().open(new File(new File(str2), str3).getPath());
                    Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
                    Charset charset = Charsets.UTF_8;
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen, charset);
                    try {
                        String text = TextStreamsKt.readText(inputStreamReader);
                        CloseableKt.closeFinally(inputStreamReader, null);
                        byte[] bytes2 = regex.replace(text, "").getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                        messageDigest.update(bytes2);
                        Uri uri = Uri.parse("file:///android_asset/" + str2);
                        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                        final VisualEffect visualEffectLoadVisualEffects$fixTags = loadVisualEffects$fixTags(VisualEffectParserKt.visualEffectFromXml(text, uri, fux));
                        if (linkedHashSet3.contains(visualEffectLoadVisualEffects$fixTags.getId())) {
                            throw new IllegalStateException("Duplicate effect id: '" + visualEffectLoadVisualEffects$fixTags.getId() + "'");
                        }
                        linkedHashSet3.add(visualEffectLoadVisualEffects$fixTags.getId());
                        List listListOf = CollectionsKt.listOf((Object[]) new String[]{visualEffectLoadVisualEffects$fixTags.getName(), visualEffectLoadVisualEffects$fixTags.getDesc()});
                        List<UserParameter> parameters = visualEffectLoadVisualEffects$fixTags.getParameters();
                        ArrayList arrayList2 = new ArrayList();
                        for (UserParameter userParameter : parameters) {
                            UserParameter.StaticText staticText = userParameter instanceof UserParameter.StaticText ? (UserParameter.StaticText) userParameter : null;
                            String text2 = staticText != null ? staticText.getText() : null;
                            if (text2 != null) {
                                arrayList2.add(text2);
                            }
                        }
                        List<UserParameter> parameters2 = visualEffectLoadVisualEffects$fixTags.getParameters();
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters2, 10));
                        Iterator<T> it = parameters2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((UserParameter) it.next()).getLabel());
                        }
                        List<UserParameter> parameters3 = visualEffectLoadVisualEffects$fixTags.getParameters();
                        ArrayList arrayList4 = new ArrayList();
                        for (UserParameter userParameter2 : parameters3) {
                            UserParameter.Selector selector = userParameter2 instanceof UserParameter.Selector ? (UserParameter.Selector) userParameter2 : null;
                            if (selector == null || (choices = selector.getChoices()) == null) {
                                linkedHashSet2 = linkedHashSet3;
                                c2 = '\n';
                                collectionEmptyList = CollectionsKt.emptyList();
                            } else {
                                linkedHashSet2 = linkedHashSet3;
                                c2 = '\n';
                                collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(choices, 10));
                                Iterator<T> it2 = choices.iterator();
                                while (it2.hasNext()) {
                                    collectionEmptyList.add(((ChoiceInfo) it2.next()).getLabel());
                                }
                            }
                            CollectionsKt.addAll(arrayList4, collectionEmptyList);
                            linkedHashSet3 = linkedHashSet2;
                        }
                        linkedHashSet = linkedHashSet3;
                        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList2), (Iterable) arrayList3), (Iterable) arrayList4);
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj : listPlus) {
                            if (StringsKt.startsWith$default((String) obj, APP_STRING_PREFIX, false, 2, (Object) null)) {
                                arrayList5.add(obj);
                            }
                        }
                        final ArrayList arrayList6 = new ArrayList();
                        for (Object obj2 : arrayList5) {
                            if (context.getResources().getIdentifier(StringsKt.drop((String) obj2, 11), "string", context.getPackageName()) == 0) {
                                arrayList6.add(obj2);
                            }
                        }
                        if (!arrayList6.isEmpty() && !visualEffectLoadVisualEffects$fixTags.getInternal()) {
                            if (!visualEffectLoadVisualEffects$fixTags.getExperimental()) {
                                throw new IllegalStateException("Missing strings in effect '" + visualEffectLoadVisualEffects$fixTags.getId() + "': " + CollectionsKt.joinToString$default(arrayList6, ",", null, null, 0, null, null, 62, null) + ".");
                            }
                            XoT.C.KN("loadVisualEffects", new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.o
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return VisualEffectKt.loadVisualEffects$lambda$85$lambda$76(visualEffectLoadVisualEffects$fixTags, arrayList6);
                                }
                            });
                        }
                        arrayList.add(visualEffectLoadVisualEffects$fixTags);
                    } finally {
                    }
                } else {
                    linkedHashSet = linkedHashSet3;
                }
                str2 = str;
                linkedHashSet3 = linkedHashSet;
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        effectSig = gnv.o(bArrDigest);
        return arrayList;
    }

    public static final long nextEffectInstanceId() {
        return nextEID.incrementAndGet();
    }

    public static final Map<String, UserParameterValue> paramsAtTime(final KeyableVisualEffectRef keyableVisualEffectRef, final float f3, final float f4) {
        Intrinsics.checkNotNullParameter(keyableVisualEffectRef, "<this>");
        return (Map) ImageCacheKt.getOrPut(effectParamsCache, TuplesKt.to(keyableVisualEffectRef, Float.valueOf(f3)), new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VisualEffectKt.paramsAtTime$lambda$0(keyableVisualEffectRef, f3, f4);
            }
        });
    }

    public static final void serialize(KeyableVisualEffectRef keyableVisualEffectRef, String str, XmlSerializer serializer) throws IOException {
        Intrinsics.checkNotNullParameter(keyableVisualEffectRef, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        serializer.startTag(str, "effect");
        serializer.attribute(str, "id", keyableVisualEffectRef.getId());
        if (keyableVisualEffectRef.getHidden()) {
            YzO.nr(serializer, str, "hidden", true);
        }
        YzO.nr(serializer, str, "locallyApplied", keyableVisualEffectRef.getLocallyApplied());
        for (Map.Entry<String, KeyableUserParameterValue> entry : keyableVisualEffectRef.getParameters().entrySet()) {
            UserParameterKt.serialize(entry.getValue(), str, serializer, entry.getKey());
        }
        serializer.endTag(str, "effect");
    }

    public static final void setEffectSig(String str) {
        effectSig = str;
    }

    public static final KeyableVisualEffectRef unserializeVisualEffect(String str, XmlPullParser parser, boolean z2) throws XmlPullParserException, IOException {
        boolean zN;
        List<UserParameter> parameters;
        KeyableUserParameterValue defaultKeyableUserParameterValue;
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, str, "effect");
        String attributeValue = parser.getAttributeValue(str, "id");
        if (attributeValue == null) {
            throw new XmlPullParserException("id missing: " + parser.getPositionDescription());
        }
        String attributeValue2 = parser.getAttributeValue(str, "hidden");
        String str2 = V8ValueBoolean.FALSE;
        if (attributeValue2 == null) {
            attributeValue2 = V8ValueBoolean.FALSE;
        }
        boolean zN2 = Ge.j.n(attributeValue2);
        if (z2) {
            zN = false;
        } else {
            String attributeValue3 = parser.getAttributeValue(str, "locallyApplied");
            if (attributeValue3 != null) {
                str2 = attributeValue3;
            }
            zN = Ge.j.n(str2);
        }
        boolean z3 = zN;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (parser.next() != 3) {
            if (parser.getEventType() == 2) {
                int depth = parser.getDepth();
                String name = parser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(name, "property")) {
                    Pair<String, KeyableUserParameterValue> pairUnserializeUserParameterValue = UserParameterKt.unserializeUserParameterValue(str, parser, z2);
                    linkedHashMap.put(pairUnserializeUserParameterValue.component1(), pairUnserializeUserParameterValue.component2());
                } else {
                    YzO.J2(parser);
                }
                if (parser.getEventType() != 3 || parser.getDepth() != depth) {
                    throw new IllegalStateException("Did not consume all tag contents");
                }
            }
        }
        VisualEffect visualEffectVisualEffectById = visualEffectById(attributeValue);
        if (visualEffectVisualEffectById != null && (parameters = visualEffectVisualEffectById.getParameters()) != null) {
            for (UserParameter userParameter : parameters) {
                if (!linkedHashMap.containsKey(userParameter.getName()) && (defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter)) != null) {
                    linkedHashMap.put(userParameter.getName(), defaultKeyableUserParameterValue);
                }
            }
        }
        return new KeyableVisualEffectRef(attributeValue, nextEffectInstanceId(), linkedHashMap, 0, zN2, z3, null, 72, null);
    }

    public static final VisualEffectRef valueAtTime(KeyableVisualEffectRef keyableVisualEffectRef, float f3, float f4) {
        Map<String, UserParameter> mapEmptyMap;
        Intrinsics.checkNotNullParameter(keyableVisualEffectRef, "<this>");
        String id = keyableVisualEffectRef.getId();
        Map<String, KeyableUserParameterValue> parameters = keyableVisualEffectRef.getParameters();
        VisualEffect visualEffectVisualEffectById = visualEffectById(keyableVisualEffectRef.getId());
        if (visualEffectVisualEffectById == null || (mapEmptyMap = visualEffectVisualEffectById.getParamsById()) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return new VisualEffectRef(id, UserParameterKt.atTimeAccum(parameters, f3, f4, mapEmptyMap), keyableVisualEffectRef.getRenderGroup(), keyableVisualEffectRef.getDisabledRenderGroups());
    }

    public static final VisualEffect visualEffectById(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        visualEffectsLoaded.await();
        return loadedVisualEffects.get(id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String adjustForTiming$lambda$12(EffectPresetTiming effectPresetTiming, int i2, int i3) {
        return "adjustForTiming: " + effectPresetTiming.name() + "   layerDuration=" + i2 + "  presetDuration=" + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float adjustForTiming$lambda$16(int i2, final int i3, KeyableUserParameterValue keyableUserParameterValue, float f3, final EffectPresetTiming effectPresetTiming, final float f4) {
        final float fAdjustForTiming$toLayerFraction;
        if (f4 < 0.45f) {
            fAdjustForTiming$toLayerFraction = adjustForTiming$toLayerFraction(adjustForTiming$toPresetMillis(f4, i3), i2, f3);
        } else if (f4 > 0.55f) {
            fAdjustForTiming$toLayerFraction = adjustForTiming$toLayerFraction(i2 - (i3 - adjustForTiming$toPresetMillis(f4, i3)), i2, f3);
        } else {
            fAdjustForTiming$toLayerFraction = 0.5f;
        }
        XoT.C.Uo(keyableUserParameterValue, new Function0() { // from class: com.alightcreative.app.motion.scene.visualeffect.eO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VisualEffectKt.adjustForTiming$lambda$16$lambda$15(effectPresetTiming, f4, fAdjustForTiming$toLayerFraction, i3);
            }
        });
        return fAdjustForTiming$toLayerFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String adjustForTiming$lambda$16$lambda$15(EffectPresetTiming effectPresetTiming, float f3, float f4, int i2) {
        return "adjustForTiming: " + effectPresetTiming.name() + ":  " + f3 + " -> " + f4 + "  //  " + adjustForTiming$toPresetMillis(f3, i2) + "ms";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float adjustForTiming$lambda$17(int i2, int i3, float f3, float f4) {
        return adjustForTiming$toLayerFraction(adjustForTiming$toPresetMillis(f4, i2), i3, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float adjustForTiming$lambda$18(int i2, int i3, float f3, float f4) {
        return adjustForTiming$toLayerFraction(i2 - (i3 - adjustForTiming$toPresetMillis(f4, i3)), i2, f3);
    }

    public static final List<VisualEffect> getVisualEffects(EffectType type, EffectType... types) throws InterruptedException {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(types, "types");
        visualEffectsLoaded.await();
        Collection<VisualEffect> collectionValues = loadedVisualEffects.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((VisualEffect) obj).getType() == type) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (EffectType effectType : types) {
            Collection<VisualEffect> collectionValues2 = loadedVisualEffects.values();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : collectionValues2) {
                if (((VisualEffect) obj2).getType() == effectType) {
                    arrayList3.add(obj2);
                }
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initVisualEffectPresets$lambda$25$lambda$22(EffectPreset effectPreset, VisualEffect visualEffect) {
        String strN;
        Iy.n localizedStrings;
        String effectId = effectPreset.getEffectId();
        if (visualEffect != null && (localizedStrings = visualEffect.getLocalizedStrings()) != null) {
            Context applicationContext = IvA.n.rl().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            strN = Iy.w6.n(localizedStrings, applicationContext, visualEffect.getName());
        } else {
            strN = null;
        }
        return "\"" + effectId + "\",\"" + strN + "\",\"" + effectPreset.getId() + "\",\"" + effectPreset.getLabel() + "\",\"" + effectPreset.getShortCode() + "\"";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initVisualEffectPresets$lambda$25$lambda$24(EffectPreset effectPreset) {
        String strReplace$default = StringsKt.replace$default(effectPreset.getLabel(), " ", "_", false, 4, (Object) null);
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strReplace$default.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return "<string name=\"effectpreset_" + new Regex("[^A-Za-z0-9_]").replace(lowerCase, "") + "\">" + effectPreset.getLabel() + "</string>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initVisualEffects$lambda$37$lambda$33(List list) {
        int i2;
        int i3;
        int i5;
        int i7;
        int i8;
        int size = list.size();
        int i9 = 0;
        if (list.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((VisualEffect) it.next()).getDeprecated() && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (list.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it2 = list.iterator();
            i3 = 0;
            while (it2.hasNext()) {
                if (((VisualEffect) it2.next()).getInternal() && (i3 = i3 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (list.isEmpty()) {
            i5 = 0;
        } else {
            Iterator it3 = list.iterator();
            i5 = 0;
            while (it3.hasNext()) {
                if (((VisualEffect) it3.next()).getExperimental() && (i5 = i5 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (list.isEmpty()) {
            i7 = 0;
        } else {
            Iterator it4 = list.iterator();
            i7 = 0;
            while (it4.hasNext()) {
                VisualEffect visualEffect = (VisualEffect) it4.next();
                if (visualEffect.getType() == EffectType.DRAWING && !visualEffect.getInternal() && !visualEffect.getExperimental() && !visualEffect.getDeprecated() && (i7 = i7 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (list.isEmpty()) {
            i8 = 0;
        } else {
            Iterator it5 = list.iterator();
            i8 = 0;
            while (it5.hasNext()) {
                VisualEffect visualEffect2 = (VisualEffect) it5.next();
                if (visualEffect2.getType() == EffectType.TEXT && !visualEffect2.getInternal() && !visualEffect2.getExperimental() && !visualEffect2.getDeprecated() && (i8 = i8 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (!list.isEmpty()) {
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                VisualEffect visualEffect3 = (VisualEffect) it6.next();
                if (!visualEffect3.getInternal() && !visualEffect3.getExperimental() && !visualEffect3.getDeprecated() && (i9 = i9 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return "total=" + size + " deprecated=" + i2 + " internal=" + i3 + " experimental=" + i5 + " drawing=" + i7 + " text=" + i8 + " usable=" + i9;
    }

    private static final String initVisualEffects$lambda$37$lambda$36$lambda$35(int i2, VisualEffect visualEffect, Context context) {
        return "Effect: " + i2 + "," + Iy.w6.rl(visualEffect.getName(), context) + "," + visualEffect.getName() + "," + visualEffect.getId() + "," + CollectionsKt.joinToString$default(visualEffect.getTags(), "/", null, null, 0, null, null, 62, null) + "," + visualEffect.getType();
    }

    private static final List<String> loadVisualEffectPresets$toEnglishUCWords(String str, Context context, List<String> list) {
        Intrinsics.checkNotNull(context);
        String strRl = Iy.w6.rl(str, context);
        if (!StringsKt.startsWith$default(strRl, "?", false, 2, (Object) null)) {
            str = strRl;
        }
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = str.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        List listSplit$default = StringsKt.split$default((CharSequence) upperCase, new String[]{" "}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(new Regex("[^A-Z0-9]").replace((String) it.next(), jhotmBbwMbr.JHjBuPWITh));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!list.contains((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private static final VisualEffect loadVisualEffects$fixTags(VisualEffect visualEffect) {
        List listEmptyList;
        List listEmptyList2;
        List<V> tags = visualEffect.getTags();
        ArrayList arrayList = new ArrayList();
        for (Object obj : tags) {
            V v2 = (V) obj;
            if (v2 != V.f75879k && v2 != V.eWT) {
                arrayList.add(obj);
            }
        }
        if (!visualEffect.getShaderGroups().isEmpty()) {
            listEmptyList = CollectionsKt.listOf(V.eWT);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) listEmptyList);
        if (Md.n().contains(visualEffect.getId())) {
            listEmptyList2 = CollectionsKt.listOf(V.f75879k);
        } else {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return VisualEffect.copy$default(visualEffect, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, CollectionsKt.plus((Collection) listPlus, (Iterable) listEmptyList2), null, null, null, null, 0, null, false, 0.0f, false, 33521663, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String loadVisualEffects$lambda$85$lambda$76(VisualEffect visualEffect, List list) {
        return "Missing strings in experimental effect '" + visualEffect.getId() + "': " + CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null) + ".";
    }

    private static final String loadVisualEffects$lambda$85$lambda$77(VisualEffect visualEffect) {
        return "Tag mismatch in '" + visualEffect.getId() + "': 'Raster' prohibited";
    }

    private static final String loadVisualEffects$lambda$85$lambda$78(VisualEffect visualEffect) {
        return "Tag mismatch in '" + visualEffect.getId() + "': 'Raster' required";
    }

    private static final String loadVisualEffects$lambda$85$lambda$79(VisualEffect visualEffect) {
        return "Tag mismatch in '" + visualEffect.getId() + "': 'MembersOnly' prohibited";
    }

    private static final String loadVisualEffects$lambda$85$lambda$80(VisualEffect visualEffect) {
        return "Tag mismatch in '" + visualEffect.getId() + "': 'MembersOnly' required";
    }

    private static final String loadVisualEffects$lambda$85$lambda$81(VisualEffect visualEffect) {
        return "Tag mismatch in '" + visualEffect.getId() + "': 'Text' prohibited";
    }

    private static final String loadVisualEffects$lambda$85$lambda$82(VisualEffect visualEffect) {
        return "Tag mismatch in '" + visualEffect.getId() + "': 'Text' required";
    }

    private static final String loadVisualEffects$lambda$85$lambda$84$lambda$83(VisualEffect visualEffect, String str) {
        return "Effect has hard-coded string: '" + visualEffect.getId() + "' / '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map paramsAtTime$lambda$0(KeyableVisualEffectRef keyableVisualEffectRef, float f3, float f4) {
        Map<String, UserParameter> mapEmptyMap;
        Map<String, KeyableUserParameterValue> parameters = keyableVisualEffectRef.getParameters();
        VisualEffect visualEffectVisualEffectById = visualEffectById(keyableVisualEffectRef.getId());
        if (visualEffectVisualEffectById == null || (mapEmptyMap = visualEffectVisualEffectById.getParamsById()) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return UserParameterKt.atTimeAccum(parameters, f3, f4, mapEmptyMap);
    }

    public static final Map<String, KeyableUserParameterValue> adjustForTiming(Map<String, KeyableUserParameterValue> map, EffectPresetTiming timing, int i2, int i3) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(timing, "timing");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), adjustForTiming((KeyableUserParameterValue) entry.getValue(), timing, i2, i3));
        }
        return linkedHashMap;
    }
}
