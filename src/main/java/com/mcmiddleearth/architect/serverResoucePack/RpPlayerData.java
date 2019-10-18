/*
 * Copyright (C) 2018 Eriol_Eandur
 *
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
package com.mcmiddleearth.architect.serverResoucePack;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;

/**
 *
 * @author Eriol_Eandur
 */
public class RpPlayerData implements Serializable {
    
    private long serialVerionsUID = 1;
            
    @Setter
    @Getter
    private boolean autoRp = true;
    @Setter
    @Getter
    private String variant = "light";
    @Setter
    @Getter
    private int resolution = 16;
    @Getter
    @Setter
    private transient RpRegion currentRegion = null;
    @Getter
    @Setter
    private String currentRpUrl = null;
    @Getter
    @Setter
    private transient PlayerResourcePackStatusEvent.Status currentRpStatus 
            = PlayerResourcePackStatusEvent.Status.DECLINED;
    
}
