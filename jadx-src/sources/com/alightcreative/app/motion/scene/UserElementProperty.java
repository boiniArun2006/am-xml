package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/alightcreative/app/motion/scene/UserElementProperty;", "", "id", "", "label", "type", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/alightcreative/app/motion/scene/userparam/DataType;)V", "getId", "()Ljava/lang/String;", "getLabel", "getType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserElementProperty {
    public static final int $stable = 0;
    private final String id;
    private final String label;
    private final DataType type;

    public static /* synthetic */ UserElementProperty copy$default(UserElementProperty userElementProperty, String str, String str2, DataType dataType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userElementProperty.id;
        }
        if ((i2 & 2) != 0) {
            str2 = userElementProperty.label;
        }
        if ((i2 & 4) != 0) {
            dataType = userElementProperty.type;
        }
        return userElementProperty.copy(str, str2, dataType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DataType getType() {
        return this.type;
    }

    public final UserElementProperty copy(String id, String label, DataType type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type, "type");
        return new UserElementProperty(id, label, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserElementProperty)) {
            return false;
        }
        UserElementProperty userElementProperty = (UserElementProperty) other;
        return Intrinsics.areEqual(this.id, userElementProperty.id) && Intrinsics.areEqual(this.label, userElementProperty.label) && this.type == userElementProperty.type;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "UserElementProperty(id=" + this.id + ", label=" + this.label + ", type=" + this.type + ")";
    }

    public UserElementProperty(String id, String label, DataType type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.label = label;
        this.type = type;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final DataType getType() {
        return this.type;
    }
}
