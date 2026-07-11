package com.alightcreative.app.motion.scene.animators;

import HI0.YzO;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005\u001a.\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u0005¨\u0006\r"}, d2 = {"serialize", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/alightcreative/app/motion/scene/animators/Animator;", "namespace", "", "serializer", "Lorg/xmlpull/v1/XmlSerializer;", "tag", "unserializeAnimator", "ns", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimatorSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatorSerializer.kt\ncom/alightcreative/app/motion/scene/animators/AnimatorSerializerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n230#2,2:48\n230#2,2:50\n1611#2,9:52\n1863#2:61\n1557#2:62\n1628#2,3:63\n1557#2:67\n1628#2,3:68\n1864#2:72\n1620#2:73\n1#3:66\n1#3:71\n*S KotlinDebug\n*F\n+ 1 AnimatorSerializer.kt\ncom/alightcreative/app/motion/scene/animators/AnimatorSerializerKt\n*L\n13#1:48,2\n27#1:50,2\n28#1:52,9\n28#1:61\n32#1:62\n32#1:63,3\n34#1:67\n34#1:68,3\n28#1:72\n28#1:73\n28#1:71\n*E\n"})
public final class AnimatorSerializerKt {
    public static final <T> void serialize(Animator<T> animator, String str, XmlSerializer serializer, String tag) throws IOException {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Iterator<T> it = AnimatorKt.getALL_ANIMATORS().iterator();
        while (it.hasNext()) {
            AnimatorInfo animatorInfo = (AnimatorInfo) it.next();
            if (Intrinsics.areEqual(animatorInfo.getAnimatorClass(), Reflection.getOrCreateKotlinClass(animator.getClass()))) {
                serializer.startTag(str, tag);
                serializer.attribute(str, "type", animatorInfo.getId());
                for (KProperty1 kProperty1 : KClasses.getDeclaredMemberProperties(Reflection.getOrCreateKotlinClass(animator.getClass()))) {
                    Intrinsics.checkNotNull(kProperty1, "null cannot be cast to non-null type kotlin.reflect.KProperty1<com.alightcreative.app.motion.scene.animators.Animator<T of com.alightcreative.app.motion.scene.animators.AnimatorSerializerKt.serialize>, kotlin.Any>");
                    serializer.attribute(str, kProperty1.getName(), kProperty1.get(animator).toString());
                }
                serializer.endTag(str, tag);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ void serialize$default(Animator animator, String str, XmlSerializer xmlSerializer, String str2, int i2, Object obj) throws IOException {
        if ((i2 & 4) != 0) {
            str2 = "animator";
        }
        serialize(animator, str, xmlSerializer, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Animator<T> unserializeAnimator(String str, XmlPullParser parser, String tag) throws XmlPullParserException, IOException, MalformedSceneException {
        Pair pair;
        Object objValueOf;
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(tag, "tag");
        parser.require(2, str, tag);
        String attributeValue = parser.getAttributeValue(str, "type");
        if (attributeValue == null) {
            throw new MalformedSceneException("Animator missing type", null, false, 6, null);
        }
        Iterator<T> it = AnimatorKt.getALL_ANIMATORS().iterator();
        while (it.hasNext()) {
            AnimatorInfo animatorInfo = (AnimatorInfo) it.next();
            if (Intrinsics.areEqual(animatorInfo.getId(), attributeValue)) {
                KFunction primaryConstructor = KClasses.getPrimaryConstructor(animatorInfo.getAnimatorClass());
                Intrinsics.checkNotNull(primaryConstructor);
                List<KParameter> parameters = primaryConstructor.getParameters();
                ArrayList arrayList = new ArrayList();
                for (KParameter kParameter : parameters) {
                    String attributeValue2 = parser.getAttributeValue(str, kParameter.getName());
                    if (attributeValue2 != null) {
                        KClass<?> jvmErasure = KTypesJvm.getJvmErasure(kParameter.getType());
                        if (Intrinsics.areEqual(jvmErasure, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            objValueOf = Integer.valueOf(Integer.parseInt(attributeValue2));
                        } else if (Intrinsics.areEqual(jvmErasure, Reflection.getOrCreateKotlinClass(IntRange.class))) {
                            List listSplit$default = StringsKt.split$default((CharSequence) attributeValue2, new String[]{".."}, false, 0, 6, (Object) null);
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                            Iterator<T> it2 = listSplit$default.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
                            }
                            objValueOf = new IntRange(((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue());
                        } else if (Intrinsics.areEqual(jvmErasure, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                            objValueOf = Float.valueOf(Float.parseFloat(attributeValue2));
                        } else if (Intrinsics.areEqual(jvmErasure, Reflection.getOrCreateKotlinClass(ClosedFloatingPointRange.class))) {
                            List listSplit$default2 = StringsKt.split$default((CharSequence) attributeValue2, new String[]{".."}, false, 0, 6, (Object) null);
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default2, 10));
                            Iterator<T> it3 = listSplit$default2.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(Float.valueOf(Float.parseFloat((String) it3.next())));
                            }
                            objValueOf = RangesKt.rangeTo(((Number) arrayList3.get(0)).floatValue(), ((Number) arrayList3.get(1)).floatValue());
                        } else {
                            objValueOf = Intrinsics.areEqual(jvmErasure, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? Boolean.valueOf(Boolean.parseBoolean(attributeValue2)) : null;
                        }
                        pair = objValueOf != null ? TuplesKt.to(kParameter, objValueOf) : null;
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                Map<KParameter, ? extends Object> map = MapsKt.toMap(arrayList);
                YzO.J2(parser);
                KFunction primaryConstructor2 = KClasses.getPrimaryConstructor(animatorInfo.getAnimatorClass());
                Intrinsics.checkNotNull(primaryConstructor2);
                if (primaryConstructor2.getParameters().size() == map.size()) {
                    KFunction primaryConstructor3 = KClasses.getPrimaryConstructor(animatorInfo.getAnimatorClass());
                    Animator<T> animator = primaryConstructor3 != null ? (Animator) primaryConstructor3.callBy(map) : null;
                    Intrinsics.checkNotNull(animator, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.animators.Animator<T of com.alightcreative.app.motion.scene.animators.AnimatorSerializerKt.unserializeAnimator>");
                    return animator;
                }
                throw new MalformedSceneException("Animator '" + attributeValue + "' is missing required parameters", null, false, 6, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ Animator unserializeAnimator$default(String str, XmlPullParser xmlPullParser, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "animator";
        }
        return unserializeAnimator(str, xmlPullParser, str2);
    }
}
