/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mrx7014.s24ultraspoofer;

import android.os.Build;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {        
        XposedBridge.log("s24ultraspoofer: Hooking into: " + lpparam.packageName);

        // ro.product.manufacturer
        XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", "Samsung");

        // ro.product.brand
        XposedHelpers.setStaticObjectField(Build.class, "BRAND", "Samsung");

        // ro.product.device
        XposedHelpers.setStaticObjectField(Build.class, "DEVICE", "e3q");

        // ro.product.system.device
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.DEVICE", "e3q");

        // ro.build.tags
        XposedHelpers.setStaticObjectField(Build.class, "TAGS", "release-keys");

        // ro.build.type
        XposedHelpers.setStaticObjectField(Build.class, "TYPE", "user");

        // ro.product.product
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT", "e3q");

        // ro.product.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "e3q");

        // ro.product.system.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "e3q");

        // ro.product.vendor.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "e3q");

        // ro.product.system_ext.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "e3q");

        // ro.product.system.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.NAME", "e3q");

        // ro.product.vendor.name
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.NAME", "e3q");

        // ro.product.system_ext.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.NAME", "e3q");

        // ro.system_ext.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.MODEL", "e3q");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT.MODEL", "e3q");

        // ro.product.vendor.model
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.MODEL", "e3q");

        // ro.product.system.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.MODEL", "e3q");

        // ro.product.flavor
        XposedHelpers.setStaticObjectField(Build.class, "FLAVOUR", "e3q-user");

        // ro.soc.model
        XposedHelpers.setStaticObjectField(Build.class, "SOC.MODEL", "SM8650-AC");
        
        // ro.gpu.model
        XposedHelpers.setStaticObjectField(Build.class, "GPU.MODEL", "Adreno750");
        
        // ro.hardware.chipname
        XposedHelpers.setStaticObjectField(Build.class, "HARDWARE.CHIPNAME", "Pineapple");
        
        // ro.build.version.oneui
        XposedHelpers.setStaticObjectField(Build.class, "BUILD.VERSION,ONEUI", "60101");

        // ro.product.board
        XposedHelpers.setStaticObjectField(Build.class, "BOARD", "e3q");

        // ro.build.id
        XposedHelpers.setStaticObjectField(Build.class, "ID", "UP1A.231005.007");

        // ro.build.fingerprint
        XposedHelpers.setStaticObjectField(Build.class, "FINGERPRINT",
                "samsung/e3q/e3q:14/UP1A.231005.007/S928BXXS3AXI7:user/release-keys");
    }
}
