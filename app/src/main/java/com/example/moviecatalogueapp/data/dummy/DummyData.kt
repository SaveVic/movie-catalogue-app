package com.example.moviecatalogueapp.data.dummy

import com.example.moviecatalogueapp.data.model.Movie
import com.example.moviecatalogueapp.data.model.TvShow

object DummyData {
    fun movies(): List<Movie> = listOf(
        Movie(
            "A Star Is Born",
            "05 Oct 2018",
            "136 min",
            "Drama, Music, Romance",
            "Bradley Cooper",
            "A musician helps a young singer find fame as age and alcoholism send his own career into a downward spiral.",
            "https://m.media-amazon.com/images/M/MV5BNmE5ZmE3OGItNTdlNC00YmMxLWEzNjctYzAwOGQ5ODg0OTI0XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg"
        ),
        Movie(
            "Alita: Battle Angel",
            "14 Feb 2019",
            "122 min",
            "Action, Adventure, Sci-Fi, Thriller",
            "Robert Rodriguez",
            "A deactivated cyborg's revived, but can't remember anything of her past and goes on a quest to find out who she is.",
            "https://m.media-amazon.com/images/M/MV5BMTQzYWYwYjctY2JhZS00NTYzLTllM2UtZWY5ZTk0NmYwYzIyXkEyXkFqcGdeQXVyMzgxODM4NjM@._V1_SX300.jpg"
        ),
        Movie(
            "Aquaman",
            "21 Dec 2018",
            "143 min",
            "Action, Adventure, Fantasy, Sci-Fi",
            "James Wan",
            "Arthur Curry, the human-born heir to the underwater kingdom of Atlantis, goes on a quest to prevent a war between the worlds of ocean and land.",
            "https://m.media-amazon.com/images/M/MV5BOTk5ODg0OTU5M15BMl5BanBnXkFtZTgwMDQ3MDY3NjM@._V1_SX300.jpg"
        ),
        Movie(
            "Bohemian Rhapsody",
            "02 Nov 2018",
            "134 min",
            "Biography, Drama, Music",
            "Bryan Singer",
            "The story of the legendary British rock band Queen and lead singer Freddie Mercury, leading up to their famous performance at Live Aid (1985).",
            "https://m.media-amazon.com/images/M/MV5BMTA2NDc3Njg5NDVeQTJeQWpwZ15BbWU4MDc1NDcxNTUz._V1_SX300.jpg"
        ),
        Movie(
            "Cold Pursuit",
            "08 Feb 2019",
            "119 min",
            "Action, Crime, Drama, Thriller",
            "Hans Petter Moland",
            "A grieving snowplow driver seeks out revenge against the drug dealers who killed his son.",
            "https://m.media-amazon.com/images/M/MV5BM2YyYWI3NjItMWEwZS00MzhkLWJmZTMtZDAzYjRhODM0OTMzXkEyXkFqcGdeQXVyMjM4NTM5NDY@._V1_SX300.jpg"
        ),
        Movie(
            "Creed II",
            "21 Nov 2018",
            "130 min",
            "Drama, Sport",
            "Steven Caple Jr.",
            "Under the tutelage of Rocky Balboa, newly crowned heavyweight champion Adonis Creed faces off against Viktor Drago, the son of Ivan Drago.",
            "https://m.media-amazon.com/images/M/MV5BYmEyNWZhM2YtZDAyNi00ZjYzLWI2ZWMtOWM4ZmI1MDE0OWNmXkEyXkFqcGdeQXVyMjMwNDgzNjc@._V1_SX300.jpg"
        ),
        Movie(
            "Fantastic Beasts: The Crimes of Grindelwald",
            "16 Nov 2018",
            "134 min",
            "Adventure, Family, Fantasy",
            "David Yates",
            "The second installment of the \"Fantastic Beasts\" series featuring the adventures of Magizoologist Newt Scamander.",
            "https://m.media-amazon.com/images/M/MV5BYWVlMDI5N2UtZTIyMC00NjZkLWI5Y2QtODM5NGE5MzA0NmVjXkEyXkFqcGdeQXVyNzU3NjUxMzE@._V1_SX300.jpg"
        ),
        Movie(
            "Glass",
            "18 Jan 2019",
            "129 min",
            "Drama, Sci-Fi, Thriller",
            "M. Night Shyamalan",
            "Security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities.",
            "https://m.media-amazon.com/images/M/MV5BMTY1OTA2MjI5OV5BMl5BanBnXkFtZTgwNzkxMjU4NjM@._V1_SX300.jpg"
        ),
        Movie(
            "Mary Queen of Scots",
            "21 Dec 2018",
            "124 min",
            "Biography, Drama, History",
            "Josie Rourke",
            "Mary Stuart's (Saoirse Ronan's) attempt to overthrow her cousin Elizabeth I (Margot Robbie), Queen of England, finds her condemned to years of imprisonment before facing execution.",
            "https://m.media-amazon.com/images/M/MV5BNDVmOGI4MTMtYmNmNC00MTliLTlkYjQtYmU2N2EyNDk2YTAwXkEyXkFqcGdeQXVyMjM4NTM5NDY@._V1_SX300.jpg"
        ),
        Movie(
            "Avengers: Infinity War",
            "27 Apr 2018",
            "149 min",
            "Action, Adventure, Sci-Fi",
            "Anthony Russo, Joe Russo",
            "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe.",
            "https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SX300.jpg"
        )
    )

    fun tvShows(): List<TvShow> = listOf(
        TvShow(
            "Arrow",
            "Arrow is an American television series developed by writer/producers Greg Berlanti, Marc Guggenheim, and Andrew Kreisberg. It is based on the DC Comics character Green Arrow, a costumed crime-fighter created by Mort Weisinger and George Papp. It premiered in North America on The CW on October 10, 2012, with international broadcasting taking place in late 2012. Primarily filmed in Vancouver, British Columbia, Canada, the series follows billionaire playboy Oliver Queen, portrayed by Stephen Amell, who, five years after being stranded on a hostile island, returns home to fight crime and corruption as a secret vigilante whose weapon of choice is a bow and arrow. Unlike in the comic books, Queen does not go by the alias \"Green Arrow\". The series takes a realistic look at the Green Arrow character, as well as other characters from the DC Comics universe. Although Oliver Queen/Green Arrow had been featured in the television series Smallville from 2006 to 2011, the producers decided to start clean and find a new actor (Amell) to portray the character. Arrow focuses on the humanity of Oliver Queen, and how he was changed by time spent shipwrecked on an island. Most episodes have flashback scenes to the five years in which Oliver was missing.",
            "2012-10-10",
            "https://static.episodate.com/images/tv-show/full/29560.jpg",
            "9.1134",
            "635",
            "Drama, Action, Science Fiction"
        ),
        TvShow(
            "Doom Patrol",
            "A re-imagining of one of DC's most beloved group of outcast super heroes: Robotman, Negative Man, Elasti-Woman and Crazy Jane, led by modern-day mad scientist Dr. Niles Caulder (The Chief). The Doom Patrol's members each suffered horrible accidents that gave them superhuman abilities - but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence - and to protect Earth from what they find. Part support group, part Super Hero team, the Doom Patrol is a band of super-powered freaks who fight for a world that wants nothing to do with them. Picking up after the events of <i>Titans</i>, <b>Doom Patrol</b> finds these reluctant heroes in a place they never expected to be, called to action by none other than Cyborg, who comes to them with a mission hard to refuse, but with a warning that is hard to ignore: their lives will never, ever be the same.",
            "2019-02-15",
            "https://static.episodate.com/images/tv-show/full/63212.jpg",
            "9.0488",
            "41",
            "Drama, Action, Science Fiction"
        ),
        TvShow(
            "Dragon Ball",
            "This is where it all begins. The story starts with Goku at 12 when he first meets Bulma and is introduced to the legend of the Dragonballs: who ever gets all seven Dragonballs will have their wish granted by Shenron, the Dragon who resides within the balls. As Goku goes along his adventure he meets other characters such as Master Roshi, Krillin and others.",
            "1986-02-26",
            "https://static.episodate.com/images/tv-show/full/3323.jpg",
            "10.0000",
            "8",
            "Action, Adventure, Fantasy, Anime"
        ),
        TvShow(
            "Fear the Walking Dead",
            "Fear the Walking Dead is an upcoming American television series created by Robert Kirkman and Dave Erickson scheduled to premiere on AMC on August 23, 2015. It is a companion series to the horror drama television series The Walking Dead, which is based on the comic book series of the same name by Robert Kirkman, Tony Moore, and Charlie Adlard. AMC greenlit the pilot to series on March 9, 2015, with a two-season commitment. The first season will consist of six episodes, while the second season received an extended order of fifteen episodes to air in 2016.<br><br>Set in Los Angeles, the series follows a divorced male teacher, a female guidance counselor, and her two children–a son and a daughter–in the opening stages of the zombie apocalypse as they come to terms with the impending collapse of civilization",
            "2015-08-23",
            "https://static.episodate.com/images/tv-show/full/46669.jpg",
            "8.5978",
            "92",
            "Drama, Action, Horror"
        ),
        TvShow(
            "Family Guy",
            "Family Guy is an American adult animated sitcom created by Seth MacFarlane for the Fox Broadcasting Company. The series centers on the Griffins, a family consisting of parents Peter and Lois; their children Meg, Chris, and Stewie; and their anthropomorphic pet dog Brian. The show is set in the fictional city of Quahog, Rhode Island, and exhibits much of its humor in the form of cutaway gags that often lampoon American culture.\r\n<br><br>\r\nThe family was conceived by MacFarlane after developing two animated films, The Life of Larry and Larry & Steve. MacFarlane redesigned the films' protagonist, Larry, and his dog, Steve, and renamed them Peter and Brian, respectively. MacFarlane pitched a seven-minute pilot to Fox on May 15, 1998. The show was given the green light and started production. Shortly after the third season of Family Guy had aired in 2001, Fox canceled the series, putting the series to a 2-year hiatus. However, favorable DVD sales and high ratings for syndicated reruns on Adult Swim convinced the network to renew the show in 2004 for a fourth season, which began airing on May 1, 2005.",
            "1999-01-31",
            "https://static.episodate.com/images/tv-show/full/3455.jpg",
            "8.5476",
            "42",
            "Comedy, Family"
        ),
        TvShow(
            "The Flash",
            "Barry Allen is a Central City police forensic scientist with a reasonably happy life, despite the childhood trauma of a mysterious red and yellow being killing his mother and framing his father. All that changes when a massive particle accelerator accident leads to Barry being struck by lightning in his lab. Coming out of coma nine months later, Barry and his new friends at STAR labs find that he now has the ability to move at superhuman speed. <br>Furthermore, Barry learns that he is but one of many affected by that event, most of whom are using their powers for evil. Determined to make a difference, Barry dedicates his life to fighting such threats, as The Flash. While he gains allies he never expected, there are also secret forces determined to aid and manipulate him for their own agenda.",
            "2014-10-07",
            "https://static.episodate.com/images/tv-show/full/35624.jpg",
            "9.3728",
            "1513",
            "Drama, Action, Science-Fiction"
        ),
        TvShow(
            "Gotham",
            "Gotham is an American crime-drama television series developed by Bruno Heller, based on characters appearing in and published by DC Comics in their Batman franchise, primarily those of James Gordon and Bruce Wayne. The series stars Ben McKenzie as the young Gordon, while Heller executive produces along with Danny Cannon, who also directed the pilot. As originally conceived, the series would have served as a straightforward story of Gordon's early days on the Gotham City police force. The idea evolved not only to include the Wayne character, but also to tell the origin stories of several Batman villains. The first season order originally consisted of 16 episodes, but was later extended to 22. Gotham premiered on Fox on September 22, 2014.",
            "2014-09-22",
            "https://static.episodate.com/images/tv-show/full/29671.png",
            "9.1010",
            "208",
            "Crime, Drama, Action"
        ),
        TvShow(
            "Grey's Anatomy",
            "Grey's Anatomy is the recipient of the 2007 Golden Globe® Award for Best Television Series - Drama, and multiple Emmy nominations, including two for Outstanding Drama Series.<br><br>\r\nThe doctors of Grey Sloan Memorial Hospital deal with life-or-death consequences on a daily basis-it's in one another that they find comfort, friendship and, at times, more than friendship. Together they're discovering that neither medicine nor relationships can be defined in black and white. Real life only comes in shades of grey.\r\n<br><br>\r\nJust before Meredith Grey begins her surgical residency at Seattle Grace, she has a one night stand with her new boss, Dr. Derek Shepherd. Just call this brilliant neurosurgeon \"McDreamy.\" Mer's future \"person,\" Cristina Yang, strikes up a relationship with cardiothoracic ace Preston Burke. Other interns include ex-model Izzie Stevens and her insecure BFF George O'Malley, who is branded \"007\" by the obnoxious Alex Karev because he has a license to kill. Dr. Miranda Bailey keeps the interns in line while Chief Richard Webber keeps the hospital running. ",
            "2005-03-27",
            "https://static.episodate.com/images/tv-show/full/3687.jpg",
            "9.5055",
            "91",
            "Drama, Medical, Romance"
        ),
        TvShow(
            "The Umbrella Academy",
            "On the same day in 1989, forty-three infants are inexplicably born to random, unconnected women who showed no signs of pregnancy the day before. Seven are adopted by Sir Reginald Hargreeves, a billionaire industrialist, who creates The Umbrella Academy and prepares his \"children\" to save the world. But not everything went according to plan. In their teenage years, the family fractured and the team disbanded. Now, the six surviving thirty-something members reunite upon the news of Hargreeve's passing. Luther, Diego, Allison, Klaus, Vanya and Number Five work together to solve a mystery surrounding their father's death. But the estranged family once again begins to come apart due to their divergent personalities and abilities, not to mention the imminent threat of a global apocalypse.",
            "2019-02-15",
            "https://static.episodate.com/images/tv-show/full/58512.jpg",
            "8.9032",
            "62",
            "Drama, Action, Science-Fiction"
        ),
        TvShow(
            "NCIS",
            "NCIS (Naval Criminal Investigative Service) is more than just an action drama. With liberal doses of humor, it's a show that focuses on the sometimes complex and always amusing dynamics of a team forced to work together in high-stress situations. NCIS Special Agent Leroy Jethro Gibbs, a former Marine gunnery sergeant, whose skills as an investigator are unmatched, leads this troupe of colorful personalities. Gibbs, a man of few words, only needs a look to explain it all. The team includes NCIS Special Agent Anthony DiNozzo, an ex-homicide detective whose instincts in the field are unparalleled and whose quick wit and humorous take on life make him a team favorite; the youthful and energetic forensic specialist Abby Sciuto, a talented scientist whose sharp mind matches her Goth style and eclectic tastes, NCIS Special Agent Timothy McGee, an MIT graduate whose brilliance with computers far overshadows his insecurities in the field, and the newest member of the team, Eleanor \"Ellie\" Bishop, a former NSA analyst . Assisting the team is medical examiner Dr. Donald \"Ducky\" Mallard, who knows it all because he's seen it all, and he's not afraid to let you know. Rounding out the team is NCIS director Leon Vance, an intelligent, highly trained agent who can always be counted on to shake up the status quo. From murder and espionage to terrorism and stolen submarines, these special agents travel the globe to investigate all crimes with Navy or Marine Corps ties.",
            "2003-09-23",
            "https://static.episodate.com/images/tv-show/full/4571.jpg",
            "9.5102",
            "49",
            "Crime, Drama, Action"
        )
    )

}