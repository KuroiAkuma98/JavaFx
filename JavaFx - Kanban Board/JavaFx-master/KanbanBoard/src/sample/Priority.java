package sample;

public enum Priority
{
    Low
            {
                public String toString()
                {
                    return "Low";
                }
            },
    High
            {
            public String toString()
                {
                    return "High";
                }
            },
    Moderate
            {
                public String toString()
                {
                    return "Moderate";
                }
            },
    Extreme
            {
                public String toString()
                {
                    return "Extreme";
                }
            }
}
