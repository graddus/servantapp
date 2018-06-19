package servant.domain;

import java.util.ArrayList;

import servant.persistence.ServantDao;
/*import servant.persistence.ServantDaoImpl;*/

public class ServantService {
/*private ServantDao dao=new ServantDaoImpl();*/
	ArrayList<Servant>servants;
	public ServantService() {
		Servant s1=new Servant(82, "Frankenstein", "Frankenstein's monster","Female", 9441, 10687, "Earth", "The artificial life form created by Victor Frankenstein.\n" + 
				"Built as the Eve that forms a pair with Adam, because her expressing of human emotions does not function well, she was branded a failed work.","There is quite a disparity between this Frankenstein and what was depicted in the novel; from the very beginning Victor aimed at creating Adam and Eve-- the original couple.\r\n" + 
						"In contrary to the Bible, he first created Eve and then thought of having Eve give birth to Adam.", 172, 48, "Europe");
		Servant s2=new Servant(199,"Sermiramis","Wise Queen of Assyria","Female",11309,13266,"Earth","The oldest known poisoner in the world, and Empress of the Assyrian Empire. By poisoning her husband Ninus, she rose her name in one stroke. \n" + 
				"For a period of time, it was rumored that she was the one who constructed one of the Seven Wonders of the Ancient World, the 'Hanging Gardens of Babylon'","Semiramis was born between the Goddess Derketo and a human, and ashamed of that fact, Derketo abandoned her by the water's side. \r\n" + 
						"But as a baby carrying the blood of the god, she was brought up by countless doves and given a new lease on life. \r\n" + 
						"Growing up beautifully, Semiramis was wed to the aging general Onnes, but the ambitious King Ninus captivated by her face half-forcefully parted her from her husband. Led to sorrow, Onnes committed suicide, and Semiramis was left with no choice but for her body to accept the King's grace.\r\n" + 
						"When the novel tactics Semiramis suggested in a war with foreign lands landed them a victory, King Ninus came to know of her splendid talent, finally deciding a formal marriage with her.\r\n" + 
						"But the moment King Ninus put his lips to his wine glass at the wedding banquet, he suddenly collapsed in pain and died. It is rumored that she laced it with poison to take revenge for her late husband. \r\n" + 
						"And thus having become Empress of Assyria, Semiramis took over the duties of managing governmental affairs for many decades, spearheading numerous expeditions and construction projects.\r\n" + 
						"Afterwards, it's been said she was murdered by her son, or perhaps after handing off power she became a dove and flew away.",169,51,"Middle East");
		Servant s3=new Servant(2,"Artoria Pendragon","King of Knights","Female",11221,15150,"Earth","A legendary king of Britain. Also called the King of Knights.\r\n" + 
				"Altria is a childhood name and, upon being raised as a king, she began to be called King Arthur.\r\n" + 
				"In an age when chivalry had lost its beauty, with a holy sword in her hands, she brought about a brief moment of peace and final prosperity to Britain.\r\n" + 
				"A man in historical fact, but it seems that in this world she was a cross-dressing beauty.","One of the ideal kings that approves a virtuous life, a virtuous livelihood for the people.\r\n" + 
						"A character with no faults that aided the weak and broke the strong.\r\n" + 
						"Calm, cool and collected; an honor student who is always serious.\r\n" + 
						"...that being said, although rarely mentioned, there is something of a sore loser in her: she does not go easy in any kind of competition and gets greatly vexed upon losing.",154,42,"England");
		Servant s4=new Servant(94,"Astolfo","One of the Twelve Paladins of Charlemagne","Male",8937,11172,"Earth","Astolfo is a character from the legend of Charlemagne, Frances most famous tale of chivalry.\r\n" + 
				"One of the Twelve Paladins of Charlemagne, and a prince of England.\r\n" + 
				"Additionally, a screwed-up Heroic Spirit who has lost all rationality.","The Twelve Paladins were knights who served Charlemagne, the King of Franks.\r\n" + 
						"Astolfo, cousin of Roland, was one of those twelve knights. However, according to legends, Astolfo was considered one of the weakest amongst the knights.",164,56,"France");
		Servant s5=new Servant(196,"Ereshkigal","Goddess of the Underworld","Female",10343,16065, "Earth","The Goddess of the Netherworld in Sumerian myth. She freely wields a spear-like cage; at times stabbing the enemy with, at times imprisoning souls, at times summoning lightning, she is the fearsome ruler of the netherworld.","The Goddess of the Netherworld in Sumerian myth. She freely wields a spear-like cage; at times stabbing the enemy with, at times imprisoning souls, at times summoning lightning, she is the fearsome ruler of the netherworld.\r\n" + 
				"Having carried out her duties of administrating the netherworld since birth, she is a goddess that disappeared along with the Age of Gods without ever knowing of the world above, or of freedom.\r\n" + 
				"This form is not that of the Goddess Ereshkigal, but that of a Pseudo-Servant where she has possessed the soul of a human with a similar wavelength to hers.\r\n" + 
				"Though she claims that her role is merely to supervise humans, like the netherworld goddess that she is... \"...it's a problem if so many people are coming to the netherworld... it's also a big issue creating cages to confine all these souls... I wonder if I can provide them a more comfortable place to be in...\"\r\n" + 
				"In this way, it's hard to fully conceal her caring heart. She is truly a red angel of the netherworld.",159,47,"Mesopotamia");
		Servant s6=new Servant(12,"Gilgamesh","King of Heroes","Male",12280,13097,"Sky","Before the Modern Era, this demigod king governed the Sumerian city-state of Uruk.\r\n" + 
				"The king described in mankind's oldest epic poem, the \"Epic of Gilgamesh\", he is considered to have existed not only in legends, but also in reality.","His nature is cruel and heartless. Never hearing people's opinions, he is a tyrant who holds only his own standards as absolute.\r\n" + 
						"Pretentiously displaying an extremely gaudy golden armor, this exceptional Heroic Spirit releases his excessive treasures as if abundant water.\r\n" + 
						"His first person pronoun writes as Ware (我) and reads as Ore (オレ).",182,68,"Babylonia");
		Servant s7=new Servant(59,"Jeanne d'Arc","Holy Maiden Savior","Female",9593,16500,"Star","The most famous holy woman in the world. Between departing from her home town at 17 years-old and being sentenced to the stake at 19 years-old, she carved her name on history in mere two years.\r\n" + 
				"The holy woman that saved France; after accomplishing a military advance that could be very well be described as miracle, she was scorned and met a tragic end.","The most famous holy woman in the world. Between departing from her home town at 17 years-old and being sentenced to the stake at 19 years-old, she carved her name on history in mere two years.\r\n" + 
						"The holy woman that saved France; after accomplishing a military advance that could be very well be described as miracle, she was scorned and met a tragic end.Even after being captured, Jeanne kept making miracles.\r\n" + 
						"It has been said that a farm girl - who should know nothing but the Bible and a few words of prayer - aptly maintained an argument with a first-class theologian on equal terms, making difficult to punish her as a heretic.A soldier that declared that he would gladly burn a witch as evil as Jeanne of Arc witnessed a white dove fly towards France, after the young woman burned.\r\n" + 
						"It was then, he lamented with deep regret, that he knew they had murdered a true saint…",159,44,"France");
		Servant s8=new Servant(68,"Okita Sōji","Sakura Saber","Female",12068,13225,"Man","Okita Souji; captain of the First Unit of the Shinsengumi, a public order organization that was mostly active in the Kyoto of the Edo period's closing days.\r\n" + 
				"Even among the Shinsengumi, which was feared as a band of master swordsmen, the one admired as the strongest genius swordsman was Okita.","A lovely girl in her mid-teens, who wraps her body in fashionable Japanese clothing.\r\n" + 
						"In order to conceal her original costume, which is simply too conspicuous, she normally uses this outfit.\r\n" + 
						"She has both the facet of a cool-headed man-slayer, as well as a cheerful side that is fond of children.",158,45,"Japan");
		Servant s9=new Servant(69,"Oda Nobunaga","Devil King of the Sixth Heaven","Female",9494,11637,"Man","The soldier of fortune from the Warring States Period, Oda Nobunaga.\r\n" + 
				"While she was called the \"Big Fool of Owari\" in her childhood, she made a name for herself in the world upon defeating Imagawa Yoshimoto in Okehazama.\r\n" + 
				"Afterwards, she eliminated many formidable enemies one after the other and even had the unification of the country within reach of her hands, but passed away in Honnouji thanks to the insurrection of Akechi Mitsuhide.","The soldier of fortune from the Warring States Period, Oda Nobunaga.\r\n" + 
						"While she was called the \"Big Fool of Owari\" in her childhood, she made a name for herself in the world upon defeating Imagawa Yoshimoto in Okehazama.\r\n" + 
						"Afterwards, she eliminated many formidable enemies one after the other and even had the unification of the country within reach of her hands, but passed away in Honnouji thanks to the insurrection of Akechi Mitsuhide.Haughty and self-confident, she possesses a flexible way of thinking that loves new things and is not bound by conservatism and common sense.\r\n" + 
						"The individual who caused the de facto downfall of the Muromachi Shogunate, and had great influence in the closure of the long, turbulent war period that lasted since the Onin War.\r\n" + 
						"That clothing that looks like a military uniform is something she prepared herself out of hobby upon being summoned as a Servant.",152,43,"Japan");
		Servant s10=new Servant(62, "Tamamo no Mae","Mizukume","Female",10546,14259,"Sky","A good-wife-aspirant, extravagant miko shaman.\r\n" + 
				"In the deathbed of the Heian Period, this peerless beauty served the retired emperor Toba.\r\n" + 
				"It has been said that she is the disguised appearance of the nine-tailed fox Hakumen Kinmou.\r\n" + 
				"For a number of reasons, in the end she was chased away from the imperial court and, after having a major decisive battle with humans in the fields of Nasu, obediently let herself be exterminated, or something.","A gal-type Servant who is overflowing with the desire of \"Currently Recruiting a Sweetheart\", in her core she desires to \"devote herself to people\".\r\n" + 
						"Her childhood name while alive was Mizukume.\r\n" + 
						"At 18 years old, she served in the imperial court and later came to work for retired emperor Toba. She became a court lady and called herself Tamamo-no-Mae.\r\n" + 
						"It has been said that she was favored by retired emperor Toba due to her beautiful looks and extensive knowledge.",160,49,"Japan");
		/*Servant s11=new Servant();
		Servant s12=new Servant();
		Servant s13=new Servant();
		Servant s14=new Servant();
		Servant s15=new Servant();
		Servant s16=new Servant();
		Servant s17=new Servant();*/
		servants=new ArrayList<Servant>();
		servants.add(s1);
		servants.add(s2);
		servants.add(s3);
		servants.add(s4);
		servants.add(s5);
		servants.add(s6);
		servants.add(s7);
		servants.add(s8);
		servants.add(s9);
		servants.add(s10);
		/*servants.add(s11);
		servants.add(s12);
		servants.add(s13);
		servants.add(s14);
		servants.add(s15);
		servants.add(s16);
		servants.add(s17);*/
	}
public ArrayList<Servant> getAllServants(){
	return servants;
}
public Servant getServantById(int id) {
	Servant result=null;
	for(Servant s:servants) {
		if (s.getId()==id) {
			result=s;
		}
	}
	return result;
}
}
