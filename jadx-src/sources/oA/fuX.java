package oA;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NotImplementedError;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClasses;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class fuX {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String J2(KClass kClass) {
        return "  >Class(" + kClass + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(String str) {
        return "String.toRefPath[Lens](" + str + ")";
    }

    public static final j nr(final String str) {
        Character chLastOrNull;
        j ml;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            XoT.C.Uo(str, new Function0() { // from class: oA.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fuX.O(str);
                }
            });
            List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"::"}, false, 2, 2, (Object) null);
            String str2 = (String) listSplit$default.get(0);
            String str3 = (String) listSplit$default.get(1);
            Class<?> cls = Class.forName(str2);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            KClass kotlinClass = JvmClassMappingKt.getKotlinClass(cls);
            Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<FROMCLASS of com.alightcreative.lens.LensKt.toRefPath>");
            Sequence sequenceSplitToSequence$default = StringsKt.splitToSequence$default((CharSequence) str3, new String[]{"."}, false, 0, 6, (Object) null);
            String str4 = (String) SequencesKt.first(sequenceSplitToSequence$default);
            boolean z2 = false;
            Object obj = null;
            for (Object obj2 : KClasses.getMemberProperties(kotlinClass)) {
                if (Intrinsics.areEqual(((KProperty1) obj2).getName(), str4)) {
                    if (z2) {
                        throw new IllegalArgumentException("Collection contains more than one matching element.");
                    }
                    z2 = true;
                    obj = obj2;
                }
            }
            if (!z2) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.reflect.KProperty1<FROMCLASS of com.alightcreative.lens.LensKt.toRefPath, kotlin.Any>");
            KProperty1 kProperty1 = (KProperty1) obj;
            j nVar = new n(kotlinClass, kProperty1.getReturnType(), kProperty1);
            for (String str5 : SequencesKt.drop(sequenceSplitToSequence$default, 1)) {
                if (StringsKt.startsWith$default((CharSequence) str5, '[', false, 2, (Object) null) && StringsKt.endsWith$default((CharSequence) str5, ']', false, 2, (Object) null)) {
                    String strSubstring = str5.substring(1, str5.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    Character chFirstOrNull = StringsKt.firstOrNull(strSubstring);
                    if (chFirstOrNull != null && chFirstOrNull.charValue() == '\'' && (chLastOrNull = StringsKt.lastOrNull(strSubstring)) != null && chLastOrNull.charValue() == '\'') {
                        KType type = nVar.nr().getArguments().get(1).getType();
                        Intrinsics.checkNotNull(type);
                        String strSubstring2 = strSubstring.substring(1, strSubstring.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        ml = new Ml(kotlinClass, type, nVar, strSubstring2);
                    } else {
                        Character chFirstOrNull2 = StringsKt.firstOrNull(strSubstring);
                        if (chFirstOrNull2 != null && chFirstOrNull2.charValue() == '\'' && StringsKt.endsWith$default(strSubstring, " as Long", false, 2, (Object) null)) {
                            KType type2 = nVar.nr().getArguments().get(1).getType();
                            Intrinsics.checkNotNull(type2);
                            ml = new Ml(kotlinClass, type2, nVar, Long.valueOf(Long.parseLong(StringsKt.substringBefore$default(StringsKt.drop(strSubstring, 1), '\'', (String) null, 2, (Object) null))));
                        } else {
                            Character chFirstOrNull3 = StringsKt.firstOrNull(strSubstring);
                            if (chFirstOrNull3 != null && chFirstOrNull3.charValue() == '\'' && StringsKt.endsWith$default(strSubstring, " as Int", false, 2, (Object) null)) {
                                KType type3 = nVar.nr().getArguments().get(1).getType();
                                Intrinsics.checkNotNull(type3);
                                ml = new Ml(kotlinClass, type3, nVar, Integer.valueOf(Integer.parseInt(StringsKt.substringBefore$default(StringsKt.drop(strSubstring, 1), '\'', (String) null, 2, (Object) null))));
                            } else {
                                Character chFirstOrNull4 = StringsKt.firstOrNull(strSubstring);
                                if (chFirstOrNull4 != null && chFirstOrNull4.charValue() == '\'' && StringsKt.endsWith$default(strSubstring, " as String", false, 2, (Object) null)) {
                                    KType type4 = nVar.nr().getArguments().get(1).getType();
                                    Intrinsics.checkNotNull(type4);
                                    ml = new Ml(kotlinClass, type4, nVar, StringsKt.substringBefore$default(StringsKt.drop(strSubstring, 1), '\'', (String) null, 2, (Object) null));
                                } else {
                                    Character chFirstOrNull5 = StringsKt.firstOrNull(strSubstring);
                                    if (chFirstOrNull5 != null && chFirstOrNull5.charValue() == '\'' && StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) " as ", false, 2, (Object) null)) {
                                        throw new NotImplementedError(null, 1, null);
                                    }
                                    int i2 = Integer.parseInt(strSubstring);
                                    KType type5 = nVar.nr().getArguments().get(0).getType();
                                    Intrinsics.checkNotNull(type5);
                                    ml = new w6(kotlinClass, type5, nVar, i2);
                                }
                            }
                        }
                    }
                    nVar = ml;
                } else {
                    KClassifier classifier = nVar.nr().getClassifier();
                    Intrinsics.checkNotNull(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    final KClass kClass = (KClass) classifier;
                    XoT.C.Uo(str, new Function0() { // from class: oA.CN3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return fuX.J2(kClass);
                        }
                    });
                    boolean z3 = false;
                    Object obj3 = null;
                    for (Object obj4 : KClasses.getMemberProperties(kClass)) {
                        if (Intrinsics.areEqual(((KProperty1) obj4).getName(), str5)) {
                            if (z3) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            z3 = true;
                            obj3 = obj4;
                        }
                    }
                    if (!z3) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, kotlin.Any>");
                    KProperty1 kProperty12 = (KProperty1) obj3;
                    nVar = new aC(kotlinClass, kProperty12.getReturnType(), nVar, kProperty12);
                }
            }
            return nVar;
        } catch (Throwable th) {
            throw new RuntimeException("Unable to resolve RefPath: '" + str + "'", th);
        }
    }

    public static final Object t(j jVar, Object receiver, Function1 updater) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(updater, "updater");
        return jVar.rl(receiver, updater.invoke(jVar.get(receiver)));
    }
}
