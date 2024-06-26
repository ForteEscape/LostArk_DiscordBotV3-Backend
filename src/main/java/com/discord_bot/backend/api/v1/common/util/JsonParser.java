package com.discord_bot.backend.api.v1.common.util;

import com.discord_bot.backend.api.v1.character.model.vo.CharacterInfoDetail;
import com.discord_bot.backend.api.v1.character.model.vo.CharacterResponse;
import com.discord_bot.backend.api.v1.notice.model.vo.News;

import java.util.List;

public interface JsonParser {

    List<News> parseNotice(String json);

    List<CharacterResponse.CharacterInfo> parseCharacterGroup(String json, String filter);

    CharacterInfoDetail.CharacterProfile parseCharacterProfile(String result);

    CharacterInfoDetail.CharacterEngraveInfo parseCharacterEngrave(String characterEngrave);

    CharacterInfoDetail.CharacterCardInfo parseCharacterCards(String characterCard);

    List<CharacterInfoDetail.CharacterEquipments> parseCharacterEquipment(String characterEquipment);

    List<CharacterInfoDetail.GemDetail> parseCharacterGems(String characterGems);
}
