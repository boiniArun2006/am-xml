package Mms;

import EJn.Pl;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Zs {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.serialization.json.j.values().length];
            try {
                iArr[kotlinx.serialization.json.j.f70272n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.serialization.json.j.f70271O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.serialization.json.j.f70274t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(XA.eO eOVar, XA.eO eOVar2, String str) {
        if ((eOVar instanceof XA.qz) && Du.yg.n(eOVar2.getDescriptor()).contains(str)) {
            String strKN = ((XA.qz) eOVar).getDescriptor().KN();
            throw new IllegalStateException(("Sealed class '" + eOVar2.getDescriptor().KN() + "' cannot be serialized as base class '" + strKN + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }

    public static final Void nr(String str, kotlinx.serialization.json.Dsr element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + Reflection.getOrCreateKotlinClass(element.getClass()).getSimpleName() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    public static final void rl(EJn.Pl kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof Pl.n) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof EJn.I28) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof EJn.Ml) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String t(EJn.Wre wre, kotlinx.serialization.json.n json) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : wre.getAnnotations()) {
            if (annotation instanceof kotlinx.serialization.json.Wre) {
                return ((kotlinx.serialization.json.Wre) annotation).discriminator();
            }
        }
        return json.O().O();
    }
}
