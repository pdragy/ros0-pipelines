node {
    git url: "https://github.com/ros-industrial/abb_robot_driver.git", branch: "master"
    registerROS('ros:melodic-desktop-full', [
        'ros-melodic-abb-egm-msgs',
        'ros-melodic-abb-egm-rws-managers',
        'ros-melodic-abb-libegm',
        'ros-melodic-abb-librws',
        'ros-melodic-abb-rapid-msgs',
        'ros-melodic-abb-rapid-sm-addin-msgs',
        'ros-melodic-abb-robot-msgs'
    ], [])
}
