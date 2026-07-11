package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/alightcreative/app/motion/scene/OptionalVector4D;", "", "<init>", "()V", "NONE", "Lcom/alightcreative/app/motion/scene/OptionalVector4D$NONE;", "Lcom/alightcreative/app/motion/scene/Vector4D;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class OptionalVector4D {
    public static final int $stable = 0;

    @StabilityInferred
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/alightcreative/app/motion/scene/OptionalVector4D$NONE;", "Lcom/alightcreative/app/motion/scene/OptionalVector4D;", "<init>", "()V", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NONE extends OptionalVector4D {
        public static final int $stable = 0;
        public static final NONE INSTANCE = new NONE();

        private NONE() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NONE);
        }

        public int hashCode() {
            return 240970467;
        }

        public String toString() {
            return "NONE";
        }
    }

    public /* synthetic */ OptionalVector4D(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionalVector4D() {
    }
}
