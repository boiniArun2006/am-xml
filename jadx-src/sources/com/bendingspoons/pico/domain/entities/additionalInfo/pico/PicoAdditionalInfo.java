package com.bendingspoons.pico.domain.entities.additionalInfo.pico;

import androidx.annotation.Keep;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0006*+,-./B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JG\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo;", "", PangleCreativeInfo.f62498a, "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$App;", "device", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device;", "install", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Install;", "monetization", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Monetization;", "experiment", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Experiment;", "userIds", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$UserIds;", "<init>", "(Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$App;Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device;Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Install;Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Monetization;Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Experiment;Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$UserIds;)V", "getApp", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$App;", "getDevice", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device;", "getInstall", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Install;", "getMonetization", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Monetization;", "getExperiment", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Experiment;", "getUserIds", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$UserIds;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "App", "Device", "Install", "Monetization", "Experiment", "UserIds", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoAdditionalInfo {
    private final App app;
    private final Device device;
    private final Experiment experiment;
    private final Install install;
    private final Monetization monetization;
    private final UserIds userIds;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$App;", "", "bspId", "", NodeModuleProcess.PROPERTY_VERSION, "bundleVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBspId", "()Ljava/lang/String;", "getVersion", "getBundleVersion", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class App {
        private final String bspId;
        private final String bundleVersion;
        private final String version;

        public static /* synthetic */ App copy$default(App app, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = app.bspId;
            }
            if ((i2 & 2) != 0) {
                str2 = app.version;
            }
            if ((i2 & 4) != 0) {
                str3 = app.bundleVersion;
            }
            return app.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBspId() {
            return this.bspId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getBundleVersion() {
            return this.bundleVersion;
        }

        public final App copy(String bspId, String version, String bundleVersion) {
            Intrinsics.checkNotNullParameter(bspId, "bspId");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(bundleVersion, "bundleVersion");
            return new App(bspId, version, bundleVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof App)) {
                return false;
            }
            App app = (App) other;
            return Intrinsics.areEqual(this.bspId, app.bspId) && Intrinsics.areEqual(this.version, app.version) && Intrinsics.areEqual(this.bundleVersion, app.bundleVersion);
        }

        public int hashCode() {
            return (((this.bspId.hashCode() * 31) + this.version.hashCode()) * 31) + this.bundleVersion.hashCode();
        }

        public String toString() {
            return qfEYuUHwj.TjPONIdnqB + this.bspId + ", version=" + this.version + ", bundleVersion=" + this.bundleVersion + ")";
        }

        public App(String bspId, String version, String bundleVersion) {
            Intrinsics.checkNotNullParameter(bspId, "bspId");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(bundleVersion, "bundleVersion");
            this.bspId = bspId;
            this.version = version;
            this.bundleVersion = bundleVersion;
        }

        public final String getBspId() {
            return this.bspId;
        }

        public final String getBundleVersion() {
            return this.bundleVersion;
        }

        public final String getVersion() {
            return this.version;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device;", "", "software", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device$Software;", "hardware", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device$Hardware;", "<init>", "(Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device$Software;Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device$Hardware;)V", "getSoftware", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device$Software;", "getHardware", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device$Hardware;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Software", "Hardware", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Device {
        private final Hardware hardware;
        private final Software software;

        @Keep
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device$Hardware;", "", "manufacturer", "", "model", "screenSizeInches", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "getManufacturer", "()Ljava/lang/String;", "getModel", "getScreenSizeInches", "()D", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Hardware {
            private final String manufacturer;
            private final String model;
            private final double screenSizeInches;

            public static /* synthetic */ Hardware copy$default(Hardware hardware, String str, String str2, double d2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = hardware.manufacturer;
                }
                if ((i2 & 2) != 0) {
                    str2 = hardware.model;
                }
                if ((i2 & 4) != 0) {
                    d2 = hardware.screenSizeInches;
                }
                return hardware.copy(str, str2, d2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getManufacturer() {
                return this.manufacturer;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getModel() {
                return this.model;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final double getScreenSizeInches() {
                return this.screenSizeInches;
            }

            public final Hardware copy(String manufacturer, String model, double screenSizeInches) {
                Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
                Intrinsics.checkNotNullParameter(model, "model");
                return new Hardware(manufacturer, model, screenSizeInches);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Hardware)) {
                    return false;
                }
                Hardware hardware = (Hardware) other;
                return Intrinsics.areEqual(this.manufacturer, hardware.manufacturer) && Intrinsics.areEqual(this.model, hardware.model) && Double.compare(this.screenSizeInches, hardware.screenSizeInches) == 0;
            }

            public int hashCode() {
                return (((this.manufacturer.hashCode() * 31) + this.model.hashCode()) * 31) + Double.hashCode(this.screenSizeInches);
            }

            public String toString() {
                return "Hardware(manufacturer=" + this.manufacturer + ", model=" + this.model + ", screenSizeInches=" + this.screenSizeInches + ")";
            }

            public Hardware(String manufacturer, String model, double d2) {
                Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
                Intrinsics.checkNotNullParameter(model, "model");
                this.manufacturer = manufacturer;
                this.model = model;
                this.screenSizeInches = d2;
            }

            public final String getManufacturer() {
                return this.manufacturer;
            }

            public final String getModel() {
                return this.model;
            }

            public final double getScreenSizeInches() {
                return this.screenSizeInches;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device$Software;", "", "osVersionApi", "", "osVersionRelease", "osBuildId", "country", "language", "locale", "timezone", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device$Software$Timezone;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device$Software$Timezone;)V", "getOsVersionApi", "()Ljava/lang/String;", "getOsVersionRelease", "getOsBuildId", "getCountry", "getLanguage", "getLocale", "getTimezone", "()Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device$Software$Timezone;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "Timezone", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Software {
            private final String country;
            private final String language;
            private final String locale;
            private final String osBuildId;
            private final String osVersionApi;
            private final String osVersionRelease;
            private final Timezone timezone;

            @Keep
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Device$Software$Timezone;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "isDaylightSaving", "", "gmtOffsetSeconds", "", "<init>", "(Ljava/lang/String;ZI)V", "getName", "()Ljava/lang/String;", "()Z", "getGmtOffsetSeconds", "()I", "component1", "component2", "component3", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Timezone {
                private final int gmtOffsetSeconds;
                private final boolean isDaylightSaving;
                private final String name;

                public static /* synthetic */ Timezone copy$default(Timezone timezone, String str, boolean z2, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        str = timezone.name;
                    }
                    if ((i3 & 2) != 0) {
                        z2 = timezone.isDaylightSaving;
                    }
                    if ((i3 & 4) != 0) {
                        i2 = timezone.gmtOffsetSeconds;
                    }
                    return timezone.copy(str, z2, i2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final boolean getIsDaylightSaving() {
                    return this.isDaylightSaving;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final int getGmtOffsetSeconds() {
                    return this.gmtOffsetSeconds;
                }

                public final Timezone copy(String name, boolean isDaylightSaving, int gmtOffsetSeconds) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    return new Timezone(name, isDaylightSaving, gmtOffsetSeconds);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Timezone)) {
                        return false;
                    }
                    Timezone timezone = (Timezone) other;
                    return Intrinsics.areEqual(this.name, timezone.name) && this.isDaylightSaving == timezone.isDaylightSaving && this.gmtOffsetSeconds == timezone.gmtOffsetSeconds;
                }

                public int hashCode() {
                    return (((this.name.hashCode() * 31) + Boolean.hashCode(this.isDaylightSaving)) * 31) + Integer.hashCode(this.gmtOffsetSeconds);
                }

                public String toString() {
                    return "Timezone(name=" + this.name + ", isDaylightSaving=" + this.isDaylightSaving + ", gmtOffsetSeconds=" + this.gmtOffsetSeconds + ")";
                }

                public Timezone(String name, boolean z2, int i2) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    this.name = name;
                    this.isDaylightSaving = z2;
                    this.gmtOffsetSeconds = i2;
                }

                public final int getGmtOffsetSeconds() {
                    return this.gmtOffsetSeconds;
                }

                public final String getName() {
                    return this.name;
                }

                public final boolean isDaylightSaving() {
                    return this.isDaylightSaving;
                }
            }

            public static /* synthetic */ Software copy$default(Software software, String str, String str2, String str3, String str4, String str5, String str6, Timezone timezone, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = software.osVersionApi;
                }
                if ((i2 & 2) != 0) {
                    str2 = software.osVersionRelease;
                }
                if ((i2 & 4) != 0) {
                    str3 = software.osBuildId;
                }
                if ((i2 & 8) != 0) {
                    str4 = software.country;
                }
                if ((i2 & 16) != 0) {
                    str5 = software.language;
                }
                if ((i2 & 32) != 0) {
                    str6 = software.locale;
                }
                if ((i2 & 64) != 0) {
                    timezone = software.timezone;
                }
                String str7 = str6;
                Timezone timezone2 = timezone;
                String str8 = str5;
                String str9 = str3;
                return software.copy(str, str2, str9, str4, str8, str7, timezone2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getOsVersionApi() {
                return this.osVersionApi;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getOsVersionRelease() {
                return this.osVersionRelease;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getOsBuildId() {
                return this.osBuildId;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getCountry() {
                return this.country;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getLanguage() {
                return this.language;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getLocale() {
                return this.locale;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final Timezone getTimezone() {
                return this.timezone;
            }

            public final Software copy(String osVersionApi, String osVersionRelease, String osBuildId, String country, String language, String locale, Timezone timezone) {
                Intrinsics.checkNotNullParameter(osVersionApi, "osVersionApi");
                Intrinsics.checkNotNullParameter(osVersionRelease, "osVersionRelease");
                Intrinsics.checkNotNullParameter(osBuildId, "osBuildId");
                Intrinsics.checkNotNullParameter(country, "country");
                Intrinsics.checkNotNullParameter(language, "language");
                Intrinsics.checkNotNullParameter(locale, "locale");
                Intrinsics.checkNotNullParameter(timezone, "timezone");
                return new Software(osVersionApi, osVersionRelease, osBuildId, country, language, locale, timezone);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Software)) {
                    return false;
                }
                Software software = (Software) other;
                return Intrinsics.areEqual(this.osVersionApi, software.osVersionApi) && Intrinsics.areEqual(this.osVersionRelease, software.osVersionRelease) && Intrinsics.areEqual(this.osBuildId, software.osBuildId) && Intrinsics.areEqual(this.country, software.country) && Intrinsics.areEqual(this.language, software.language) && Intrinsics.areEqual(this.locale, software.locale) && Intrinsics.areEqual(this.timezone, software.timezone);
            }

            public int hashCode() {
                return (((((((((((this.osVersionApi.hashCode() * 31) + this.osVersionRelease.hashCode()) * 31) + this.osBuildId.hashCode()) * 31) + this.country.hashCode()) * 31) + this.language.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.timezone.hashCode();
            }

            public String toString() {
                return "Software(osVersionApi=" + this.osVersionApi + ", osVersionRelease=" + this.osVersionRelease + ", osBuildId=" + this.osBuildId + ", country=" + this.country + ", language=" + this.language + ", locale=" + this.locale + ", timezone=" + this.timezone + ")";
            }

            public Software(String osVersionApi, String osVersionRelease, String osBuildId, String country, String language, String locale, Timezone timezone) {
                Intrinsics.checkNotNullParameter(osVersionApi, "osVersionApi");
                Intrinsics.checkNotNullParameter(osVersionRelease, "osVersionRelease");
                Intrinsics.checkNotNullParameter(osBuildId, "osBuildId");
                Intrinsics.checkNotNullParameter(country, "country");
                Intrinsics.checkNotNullParameter(language, "language");
                Intrinsics.checkNotNullParameter(locale, "locale");
                Intrinsics.checkNotNullParameter(timezone, "timezone");
                this.osVersionApi = osVersionApi;
                this.osVersionRelease = osVersionRelease;
                this.osBuildId = osBuildId;
                this.country = country;
                this.language = language;
                this.locale = locale;
                this.timezone = timezone;
            }

            public final String getCountry() {
                return this.country;
            }

            public final String getLanguage() {
                return this.language;
            }

            public final String getLocale() {
                return this.locale;
            }

            public final String getOsBuildId() {
                return this.osBuildId;
            }

            public final String getOsVersionApi() {
                return this.osVersionApi;
            }

            public final String getOsVersionRelease() {
                return this.osVersionRelease;
            }

            public final Timezone getTimezone() {
                return this.timezone;
            }
        }

        public static /* synthetic */ Device copy$default(Device device, Software software, Hardware hardware, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                software = device.software;
            }
            if ((i2 & 2) != 0) {
                hardware = device.hardware;
            }
            return device.copy(software, hardware);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Software getSoftware() {
            return this.software;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Hardware getHardware() {
            return this.hardware;
        }

        public final Device copy(Software software, Hardware hardware) {
            Intrinsics.checkNotNullParameter(software, "software");
            Intrinsics.checkNotNullParameter(hardware, "hardware");
            return new Device(software, hardware);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Device)) {
                return false;
            }
            Device device = (Device) other;
            return Intrinsics.areEqual(this.software, device.software) && Intrinsics.areEqual(this.hardware, device.hardware);
        }

        public int hashCode() {
            return (this.software.hashCode() * 31) + this.hardware.hashCode();
        }

        public String toString() {
            return "Device(software=" + this.software + ", hardware=" + this.hardware + ")";
        }

        public Device(Software software, Hardware hardware) {
            Intrinsics.checkNotNullParameter(software, "software");
            Intrinsics.checkNotNullParameter(hardware, "hardware");
            this.software = software;
            this.hardware = hardware;
        }

        public final Hardware getHardware() {
            return this.hardware;
        }

        public final Software getSoftware() {
            return this.software;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Experiment;", "", "<init>", "()V", "Segmented", "Baseline", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Experiment$Baseline;", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Experiment$Segmented;", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Experiment {

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Experiment$Baseline;", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Experiment;", "<init>", "()V", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Baseline extends Experiment {
            public static final Baseline INSTANCE = new Baseline();

            private Baseline() {
                super(null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0003J#\u0010\f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Experiment$Segmented;", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Experiment;", "segments", "", "", "", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/SegmentSet;", "<init>", "(Ljava/util/Map;)V", "getSegments", "()Ljava/util/Map;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Segmented extends Experiment {
            private final Map<String, Integer> segments;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Segmented copy$default(Segmented segmented, Map map, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    map = segmented.segments;
                }
                return segmented.copy(map);
            }

            public final Map<String, Integer> component1() {
                return this.segments;
            }

            public final Segmented copy(Map<String, Integer> segments) {
                Intrinsics.checkNotNullParameter(segments, "segments");
                return new Segmented(segments);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Segmented) && Intrinsics.areEqual(this.segments, ((Segmented) other).segments);
            }

            public int hashCode() {
                return this.segments.hashCode();
            }

            public String toString() {
                return "Segmented(segments=" + this.segments + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Segmented(Map<String, Integer> segments) {
                super(null);
                Intrinsics.checkNotNullParameter(segments, "segments");
                this.segments = segments;
            }

            public final Map<String, Integer> getSegments() {
                return this.segments;
            }
        }

        public /* synthetic */ Experiment(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Experiment() {
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Install;", "", "occurredBeforePico", "", "<init>", "(Z)V", "getOccurredBeforePico", "()Z", "component1", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Install {
        private final boolean occurredBeforePico;

        public static /* synthetic */ Install copy$default(Install install, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = install.occurredBeforePico;
            }
            return install.copy(z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getOccurredBeforePico() {
            return this.occurredBeforePico;
        }

        public final Install copy(boolean occurredBeforePico) {
            return new Install(occurredBeforePico);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Install) && this.occurredBeforePico == ((Install) other).occurredBeforePico;
        }

        public int hashCode() {
            return Boolean.hashCode(this.occurredBeforePico);
        }

        public String toString() {
            return "Install(occurredBeforePico=" + this.occurredBeforePico + ")";
        }

        public final boolean getOccurredBeforePico() {
            return this.occurredBeforePico;
        }

        public Install(boolean z2) {
            this.occurredBeforePico = z2;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Monetization;", "", "isPremium", "", "everythingIsFree", "<init>", "(ZLjava/lang/Boolean;)V", "()Z", "getEverythingIsFree", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(ZLjava/lang/Boolean;)Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$Monetization;", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Monetization {
        private final Boolean everythingIsFree;
        private final boolean isPremium;

        public static /* synthetic */ Monetization copy$default(Monetization monetization, boolean z2, Boolean bool, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = monetization.isPremium;
            }
            if ((i2 & 2) != 0) {
                bool = monetization.everythingIsFree;
            }
            return monetization.copy(z2, bool);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsPremium() {
            return this.isPremium;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getEverythingIsFree() {
            return this.everythingIsFree;
        }

        public final Monetization copy(boolean isPremium, Boolean everythingIsFree) {
            return new Monetization(isPremium, everythingIsFree);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Monetization)) {
                return false;
            }
            Monetization monetization = (Monetization) other;
            return this.isPremium == monetization.isPremium && Intrinsics.areEqual(this.everythingIsFree, monetization.everythingIsFree);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isPremium) * 31;
            Boolean bool = this.everythingIsFree;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "Monetization(isPremium=" + this.isPremium + ", everythingIsFree=" + this.everythingIsFree + ")";
        }

        public final Boolean getEverythingIsFree() {
            return this.everythingIsFree;
        }

        public final boolean isPremium() {
            return this.isPremium;
        }

        public Monetization(boolean z2, Boolean bool) {
            this.isPremium = z2;
            this.everythingIsFree = bool;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005j\u0002`\u0006HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005j\u0002`\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/PicoAdditionalInfo$UserIds;", "", "backupPersistentId", "", "additionalIds", "", "Lcom/bendingspoons/pico/domain/entities/additionalInfo/pico/IdSet;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getBackupPersistentId", "()Ljava/lang/String;", "getAdditionalIds", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserIds {
        private final Map<String, String> additionalIds;
        private final String backupPersistentId;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserIds copy$default(UserIds userIds, String str, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = userIds.backupPersistentId;
            }
            if ((i2 & 2) != 0) {
                map = userIds.additionalIds;
            }
            return userIds.copy(str, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBackupPersistentId() {
            return this.backupPersistentId;
        }

        public final Map<String, String> component2() {
            return this.additionalIds;
        }

        public final UserIds copy(String backupPersistentId, Map<String, String> additionalIds) {
            Intrinsics.checkNotNullParameter(backupPersistentId, "backupPersistentId");
            Intrinsics.checkNotNullParameter(additionalIds, "additionalIds");
            return new UserIds(backupPersistentId, additionalIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserIds)) {
                return false;
            }
            UserIds userIds = (UserIds) other;
            return Intrinsics.areEqual(this.backupPersistentId, userIds.backupPersistentId) && Intrinsics.areEqual(this.additionalIds, userIds.additionalIds);
        }

        public int hashCode() {
            return (this.backupPersistentId.hashCode() * 31) + this.additionalIds.hashCode();
        }

        public String toString() {
            return "UserIds(backupPersistentId=" + this.backupPersistentId + ", additionalIds=" + this.additionalIds + ")";
        }

        public UserIds(String backupPersistentId, Map<String, String> additionalIds) {
            Intrinsics.checkNotNullParameter(backupPersistentId, "backupPersistentId");
            Intrinsics.checkNotNullParameter(additionalIds, "additionalIds");
            this.backupPersistentId = backupPersistentId;
            this.additionalIds = additionalIds;
        }

        public final Map<String, String> getAdditionalIds() {
            return this.additionalIds;
        }

        public final String getBackupPersistentId() {
            return this.backupPersistentId;
        }
    }

    public static /* synthetic */ PicoAdditionalInfo copy$default(PicoAdditionalInfo picoAdditionalInfo, App app, Device device, Install install, Monetization monetization, Experiment experiment, UserIds userIds, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            app = picoAdditionalInfo.app;
        }
        if ((i2 & 2) != 0) {
            device = picoAdditionalInfo.device;
        }
        if ((i2 & 4) != 0) {
            install = picoAdditionalInfo.install;
        }
        if ((i2 & 8) != 0) {
            monetization = picoAdditionalInfo.monetization;
        }
        if ((i2 & 16) != 0) {
            experiment = picoAdditionalInfo.experiment;
        }
        if ((i2 & 32) != 0) {
            userIds = picoAdditionalInfo.userIds;
        }
        Experiment experiment2 = experiment;
        UserIds userIds2 = userIds;
        return picoAdditionalInfo.copy(app, device, install, monetization, experiment2, userIds2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final App getApp() {
        return this.app;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Device getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Install getInstall() {
        return this.install;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Monetization getMonetization() {
        return this.monetization;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Experiment getExperiment() {
        return this.experiment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserIds getUserIds() {
        return this.userIds;
    }

    public final PicoAdditionalInfo copy(App app, Device device, Install install, Monetization monetization, Experiment experiment, UserIds userIds) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(install, "install");
        Intrinsics.checkNotNullParameter(monetization, "monetization");
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        return new PicoAdditionalInfo(app, device, install, monetization, experiment, userIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoAdditionalInfo)) {
            return false;
        }
        PicoAdditionalInfo picoAdditionalInfo = (PicoAdditionalInfo) other;
        return Intrinsics.areEqual(this.app, picoAdditionalInfo.app) && Intrinsics.areEqual(this.device, picoAdditionalInfo.device) && Intrinsics.areEqual(this.install, picoAdditionalInfo.install) && Intrinsics.areEqual(this.monetization, picoAdditionalInfo.monetization) && Intrinsics.areEqual(this.experiment, picoAdditionalInfo.experiment) && Intrinsics.areEqual(this.userIds, picoAdditionalInfo.userIds);
    }

    public int hashCode() {
        int iHashCode = ((((((this.app.hashCode() * 31) + this.device.hashCode()) * 31) + this.install.hashCode()) * 31) + this.monetization.hashCode()) * 31;
        Experiment experiment = this.experiment;
        return ((iHashCode + (experiment == null ? 0 : experiment.hashCode())) * 31) + this.userIds.hashCode();
    }

    public String toString() {
        return "PicoAdditionalInfo(app=" + this.app + ", device=" + this.device + ", install=" + this.install + ", monetization=" + this.monetization + ", experiment=" + this.experiment + ", userIds=" + this.userIds + ")";
    }

    public PicoAdditionalInfo(App app, Device device, Install install, Monetization monetization, Experiment experiment, UserIds userIds) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(install, "install");
        Intrinsics.checkNotNullParameter(monetization, "monetization");
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        this.app = app;
        this.device = device;
        this.install = install;
        this.monetization = monetization;
        this.experiment = experiment;
        this.userIds = userIds;
    }

    public final App getApp() {
        return this.app;
    }

    public final Device getDevice() {
        return this.device;
    }

    public final Experiment getExperiment() {
        return this.experiment;
    }

    public final Install getInstall() {
        return this.install;
    }

    public final Monetization getMonetization() {
        return this.monetization;
    }

    public final UserIds getUserIds() {
        return this.userIds;
    }
}
