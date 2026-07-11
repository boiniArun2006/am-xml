package com.alightcreative.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class l3D {

    public static final class j implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f47426n;
        final /* synthetic */ Context rl;

        j(Ref.ObjectRef objectRef, Context context) {
            this.f47426n = objectRef;
            this.rl = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [T, com.alightcreative.widget.z] */
        @Override // com.alightcreative.widget.QJ
        public void J2(int i2) {
            Ref.ObjectRef objectRef = this.f47426n;
            C1766z c1766z = (C1766z) objectRef.element;
            String string = this.rl.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            objectRef.element = C1766z.rl(c1766z, null, null, false, false, false, false, false, string, false, null, null, 0, 0, null, null, null, false, 130943, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [T, com.alightcreative.widget.z] */
        @Override // com.alightcreative.widget.QJ
        public void KN(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Ref.ObjectRef objectRef = this.f47426n;
            objectRef.element = C1766z.rl((C1766z) objectRef.element, null, new BitmapDrawable(this.rl.getResources(), bitmap), false, false, false, false, false, null, false, null, null, 0, 0, null, null, null, false, 131069, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, com.alightcreative.widget.z] */
        @Override // com.alightcreative.widget.QJ
        public void O(Drawable drawable) {
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            Ref.ObjectRef objectRef = this.f47426n;
            objectRef.element = C1766z.rl((C1766z) objectRef.element, null, drawable, false, false, false, false, false, null, false, null, null, 0, 0, null, null, null, false, 131069, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, com.alightcreative.widget.z] */
        @Override // com.alightcreative.widget.QJ
        public void Uo() {
            Ref.ObjectRef objectRef = this.f47426n;
            objectRef.element = C1766z.rl((C1766z) objectRef.element, null, null, false, false, false, false, false, null, false, null, null, 0, 0, null, null, null, false, 131007, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [T, com.alightcreative.widget.z] */
        @Override // com.alightcreative.widget.QJ
        public void n(oXP style) {
            Intrinsics.checkNotNullParameter(style, "style");
            Ref.ObjectRef objectRef = this.f47426n;
            objectRef.element = C1766z.rl((C1766z) objectRef.element, null, null, false, style == oXP.f47462t, false, false, false, null, false, null, null, 0, 0, null, null, null, true, 65527, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [T, com.alightcreative.widget.z] */
        @Override // com.alightcreative.widget.QJ
        public void nr(int i2) {
            Ref.ObjectRef objectRef = this.f47426n;
            objectRef.element = C1766z.rl((C1766z) objectRef.element, null, this.rl.getDrawable(i2), false, false, false, false, false, null, false, null, null, 0, 0, null, null, null, false, 131069, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, com.alightcreative.widget.z] */
        @Override // com.alightcreative.widget.QJ
        public void rl(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            Ref.ObjectRef objectRef = this.f47426n;
            objectRef.element = C1766z.rl((C1766z) objectRef.element, null, null, false, false, false, false, false, string, false, null, null, 0, 0, null, null, null, false, 130943, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, com.alightcreative.widget.z] */
        @Override // com.alightcreative.widget.QJ
        public void t(Function0 action) {
            Intrinsics.checkNotNullParameter(action, "action");
            Ref.ObjectRef objectRef = this.f47426n;
            objectRef.element = C1766z.rl((C1766z) objectRef.element, null, null, false, false, false, false, false, null, false, action, null, 0, 0, null, null, null, false, 130559, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, com.alightcreative.widget.z] */
        @Override // com.alightcreative.widget.QJ
        public void xMQ(int i2) {
            Ref.ObjectRef objectRef = this.f47426n;
            objectRef.element = C1766z.rl((C1766z) objectRef.element, null, null, false, false, false, false, false, null, false, null, null, i2, 0, null, null, null, false, 129023, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.alightcreative.widget.z] */
    public static final C1766z rl(Context context, Function1 function1) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new C1766z(null, null, false, false, false, false, false, null, false, null, null, 0, 0, null, null, null, false, 131071, null);
        function1.invoke(new j(objectRef, context));
        return (C1766z) objectRef.element;
    }
}
