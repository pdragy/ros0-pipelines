node {
    git url: 'https://github.com/ros-industrial/staubli_experimental.git', branch: 'kinetic-devel'
    registerROS('ros:melodic-desktop-full', [
        'ros-melodic-staubli',
        'ros-melodic-industrial-robot-client',
        'ros-melodic-moveit-core'
    ], [])
}
