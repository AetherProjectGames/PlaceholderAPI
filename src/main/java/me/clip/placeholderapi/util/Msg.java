/*
 * This file is part of PlaceholderAPI
 *
 * PlaceholderAPI
 * Copyright (c) 2015 - 2020 PlaceholderAPI Team
 *
 * PlaceholderAPI free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlaceholderAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package me.clip.placeholderapi.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class Msg
{

	public static void msg(@NotNull final CommandSender sender, @NotNull final String... messages)
	{
		if (messages.length == 0)
		{
			return;
		}

		sender.sendMessage(Arrays.stream(messages).map(Msg::color).collect(Collectors.joining("\n")));
	}

	public static void broadcast(@NotNull final String... messages)
	{
		if (messages.length == 0)
		{
			return;
		}

		Bukkit.broadcastMessage(Arrays.stream(messages).map(Msg::color).collect(Collectors.joining("\n")));
	}

	public static String color(@NotNull final String text)
	{
		return ChatColor.translateAlternateColorCodes('&', text);
	}

}
