package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/alightcreative/app/motion/scene/OptionalKeyableVector2D;", "", "<init>", "()V", "keyed", "", "getKeyed", "()Z", "NONE", "Lcom/alightcreative/app/motion/scene/KeyableVector2D;", "Lcom/alightcreative/app/motion/scene/OptionalKeyableVector2D$NONE;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class OptionalKeyableVector2D {
    public static final int $stable = 0;

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/alightcreative/app/motion/scene/OptionalKeyableVector2D$NONE;", "Lcom/alightcreative/app/motion/scene/OptionalKeyableVector2D;", "<init>", "()V", "keyed", "", "getKeyed", "()Z", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NONE extends OptionalKeyableVector2D {
        public static final int $stable = 0;
        public static final NONE INSTANCE = new NONE();

        private NONE() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NONE);
        }

        @Override // com.alightcreative.app.motion.scene.OptionalKeyableVector2D, com.alightcreative.app.motion.scene.Keyable
        public boolean getKeyed() {
            return false;
        }

        public int hashCode() {
            return -24550584;
        }

        public String toString() {
            return "NONE";
        }
    }

    public /* synthetic */ OptionalKeyableVector2D(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean getKeyed();

    private OptionalKeyableVector2D() {
    }
}
