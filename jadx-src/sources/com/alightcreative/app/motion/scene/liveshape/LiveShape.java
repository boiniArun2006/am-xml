package com.alightcreative.app.motion.scene.liveshape;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.scripting.ACScript;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJh\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0013R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0018R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b-\u0010\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b.\u0010\u0016R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u0010\u001cR'\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/LiveShape;", "", "", "id", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", "parameters", "LIy/n;", "localizedStrings", "Lcom/alightcreative/app/motion/scene/scripting/ACScript;", "scripts", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandle;", "handles", "", "deprecated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LIy/n;Ljava/util/List;Ljava/util/List;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()LIy/n;", "component5", "component6", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LIy/n;Ljava/util/List;Ljava/util/List;Z)Lcom/alightcreative/app/motion/scene/liveshape/LiveShape;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Ljava/util/List;", "getParameters", "LIy/n;", "getLocalizedStrings", "getScripts", "getHandles", "Z", "getDeprecated", "", "paramsById$delegate", "Lkotlin/Lazy;", "getParamsById", "()Ljava/util/Map;", "paramsById", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveShape.kt\ncom/alightcreative/app/motion/scene/liveshape/LiveShape\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1202#2,2:197\n1230#2,4:199\n*S KotlinDebug\n*F\n+ 1 LiveShape.kt\ncom/alightcreative/app/motion/scene/liveshape/LiveShape\n*L\n61#1:197,2\n61#1:199,4\n*E\n"})
public final /* data */ class LiveShape {
    public static final int $stable = 8;
    private final boolean deprecated;
    private final List<ShapeHandle> handles;
    private final String id;
    private final Iy.n localizedStrings;
    private final String name;
    private final List<UserParameter> parameters;

    /* JADX INFO: renamed from: paramsById$delegate, reason: from kotlin metadata */
    private final Lazy paramsById;
    private final List<ACScript> scripts;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<UserParameter> component3() {
        return this.parameters;
    }

    public final List<ACScript> component5() {
        return this.scripts;
    }

    public final List<ShapeHandle> component6() {
        return this.handles;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDeprecated() {
        return this.deprecated;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveShape)) {
            return false;
        }
        LiveShape liveShape = (LiveShape) other;
        return Intrinsics.areEqual(this.id, liveShape.id) && Intrinsics.areEqual(this.name, liveShape.name) && Intrinsics.areEqual(this.parameters, liveShape.parameters) && Intrinsics.areEqual(this.localizedStrings, liveShape.localizedStrings) && Intrinsics.areEqual(this.scripts, liveShape.scripts) && Intrinsics.areEqual(this.handles, liveShape.handles) && this.deprecated == liveShape.deprecated;
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.localizedStrings.hashCode()) * 31) + this.scripts.hashCode()) * 31) + this.handles.hashCode()) * 31) + Boolean.hashCode(this.deprecated);
    }

    public String toString() {
        return "LiveShape(id=" + this.id + ", name=" + this.name + ", parameters=" + this.parameters + ", localizedStrings=" + this.localizedStrings + ", scripts=" + this.scripts + ", handles=" + this.handles + ", deprecated=" + this.deprecated + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveShape(String id, String name, List<? extends UserParameter> parameters, Iy.n localizedStrings, List<ACScript> scripts, List<ShapeHandle> handles, boolean z2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(localizedStrings, "localizedStrings");
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(handles, "handles");
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.localizedStrings = localizedStrings;
        this.scripts = scripts;
        this.handles = handles;
        this.deprecated = z2;
        this.paramsById = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShape.paramsById_delegate$lambda$1(this.f46120n);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveShape copy$default(LiveShape liveShape, String str, String str2, List list, Iy.n nVar, List list2, List list3, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveShape.id;
        }
        if ((i2 & 2) != 0) {
            str2 = liveShape.name;
        }
        if ((i2 & 4) != 0) {
            list = liveShape.parameters;
        }
        if ((i2 & 8) != 0) {
            nVar = liveShape.localizedStrings;
        }
        if ((i2 & 16) != 0) {
            list2 = liveShape.scripts;
        }
        if ((i2 & 32) != 0) {
            list3 = liveShape.handles;
        }
        if ((i2 & 64) != 0) {
            z2 = liveShape.deprecated;
        }
        List list4 = list3;
        boolean z3 = z2;
        List list5 = list2;
        List list6 = list;
        return liveShape.copy(str, str2, list6, nVar, list5, list4, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map paramsById_delegate$lambda$1(LiveShape liveShape) {
        List<UserParameter> list = liveShape.parameters;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((UserParameter) obj).getName(), obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Iy.n getLocalizedStrings() {
        return this.localizedStrings;
    }

    public final LiveShape copy(String id, String name, List<? extends UserParameter> parameters, Iy.n localizedStrings, List<ACScript> scripts, List<ShapeHandle> handles, boolean deprecated) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(localizedStrings, "localizedStrings");
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(handles, "handles");
        return new LiveShape(id, name, parameters, localizedStrings, scripts, handles, deprecated);
    }

    public final boolean getDeprecated() {
        return this.deprecated;
    }

    public final List<ShapeHandle> getHandles() {
        return this.handles;
    }

    public final String getId() {
        return this.id;
    }

    public final Iy.n getLocalizedStrings() {
        return this.localizedStrings;
    }

    public final String getName() {
        return this.name;
    }

    public final List<UserParameter> getParameters() {
        return this.parameters;
    }

    public final Map<String, UserParameter> getParamsById() {
        return (Map) this.paramsById.getValue();
    }

    public final List<ACScript> getScripts() {
        return this.scripts;
    }
}
